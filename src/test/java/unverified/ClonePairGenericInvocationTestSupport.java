package unverified;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

final class ClonePairGenericInvocationTestSupport {

    @FunctionalInterface
    interface Invocation {
        Object invoke(Object[] args) throws Throwable;
    }

    static final class InvocationOutcome {

        final String status;
        final String valueSnapshot;
        final String exceptionClass;
        final String stdout;
        final String stderr;
        final String originalInputsSnapshot;
        final String inputAfterSnapshot;

        private InvocationOutcome(
            String status,
            String valueSnapshot,
            String exceptionClass,
            String stdout,
            String stderr,
            String originalInputsSnapshot,
            String inputAfterSnapshot
        ) {
            this.status = status;
            this.valueSnapshot = valueSnapshot;
            this.exceptionClass = exceptionClass;
            this.stdout = stdout;
            this.stderr = stderr;
            this.originalInputsSnapshot = originalInputsSnapshot;
            this.inputAfterSnapshot = inputAfterSnapshot;
        }
    }

    static final class ToStringObject {

        final String text;

        ToStringObject(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    static final class ThrowingToStringObject {

        @Override
        public String toString() {
            throw new IllegalStateException("boom");
        }
    }

    private ClonePairGenericInvocationTestSupport() {
    }

    static InvocationOutcome capture(Invocation invocation, Object... inputs) {
        Object[] actualInputs = cloneInputs(inputs);
        String originalInputsSnapshot = snapshot(actualInputs);
        ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();
        ByteArrayOutputStream stderrBuffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        PrintStream capturedOut = new PrintStream(stdoutBuffer, true, StandardCharsets.UTF_8);
        PrintStream capturedErr = new PrintStream(stderrBuffer, true, StandardCharsets.UTF_8);
        try {
            System.setOut(capturedOut);
            System.setErr(capturedErr);
            Object value = invocation.invoke(actualInputs);
            return new InvocationOutcome(
                "OK",
                snapshot(value),
                null,
                stdoutBuffer.toString(StandardCharsets.UTF_8),
                stderrBuffer.toString(StandardCharsets.UTF_8),
                originalInputsSnapshot,
                snapshot(actualInputs)
            );
        } catch (Throwable throwable) {
            return new InvocationOutcome(
                "EX",
                null,
                throwable.getClass().getName(),
                stdoutBuffer.toString(StandardCharsets.UTF_8),
                stderrBuffer.toString(StandardCharsets.UTF_8),
                originalInputsSnapshot,
                snapshot(actualInputs)
            );
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
            capturedOut.close();
            capturedErr.close();
        }
    }

    static InvocationOutcome captureWithTimeout(Invocation invocation, long timeoutMillis, Object... inputs) {
        Object[] actualInputs = cloneInputs(inputs);
        String originalInputsSnapshot = snapshot(actualInputs);
        ByteArrayOutputStream stdoutBuffer = new ByteArrayOutputStream();
        ByteArrayOutputStream stderrBuffer = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        PrintStream capturedOut = new PrintStream(stdoutBuffer, true, StandardCharsets.UTF_8);
        PrintStream capturedErr = new PrintStream(stderrBuffer, true, StandardCharsets.UTF_8);
        ExecutorService executor = Executors.newSingleThreadExecutor(new DaemonThreadFactory());
        try {
            System.setOut(capturedOut);
            System.setErr(capturedErr);
            Future<Object> future = executor.submit(new Callable<>() {
                @Override
                public Object call() throws Exception {
                    try {
                        return invocation.invoke(actualInputs);
                    } catch (Exception exception) {
                        throw exception;
                    } catch (Throwable throwable) {
                        throw new InvocationFailure(throwable);
                    }
                }
            });
            try {
                Object value = future.get(timeoutMillis, TimeUnit.MILLISECONDS);
                return new InvocationOutcome(
                    "OK",
                    snapshot(value),
                    null,
                    stdoutBuffer.toString(StandardCharsets.UTF_8),
                    stderrBuffer.toString(StandardCharsets.UTF_8),
                    originalInputsSnapshot,
                    snapshot(actualInputs)
                );
            } catch (TimeoutException timeoutException) {
                future.cancel(true);
                return new InvocationOutcome(
                    "TIMEOUT",
                    null,
                    null,
                    stdoutBuffer.toString(StandardCharsets.UTF_8),
                    stderrBuffer.toString(StandardCharsets.UTF_8),
                    originalInputsSnapshot,
                    snapshot(actualInputs)
                );
            } catch (ExecutionException executionException) {
                Throwable cause = executionException.getCause();
                if (cause instanceof InvocationFailure invocationFailure) {
                    cause = invocationFailure.cause;
                }
                return new InvocationOutcome(
                    "EX",
                    null,
                    cause.getClass().getName(),
                    stdoutBuffer.toString(StandardCharsets.UTF_8),
                    stderrBuffer.toString(StandardCharsets.UTF_8),
                    originalInputsSnapshot,
                    snapshot(actualInputs)
                );
            } catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                return new InvocationOutcome(
                    "TIMEOUT",
                    null,
                    null,
                    stdoutBuffer.toString(StandardCharsets.UTF_8),
                    stderrBuffer.toString(StandardCharsets.UTF_8),
                    originalInputsSnapshot,
                    snapshot(actualInputs)
                );
            }
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
            executor.shutdownNow();
            capturedOut.close();
            capturedErr.close();
        }
    }

    static void assertOutcome(
        InvocationOutcome actual,
        String expectedStatus,
        String expectedValueSnapshot,
        String expectedExceptionClass,
        String expectedStdout,
        String expectedStderr,
        String expectedOriginalInputsSnapshot,
        String expectedInputAfterSnapshot
    ) {
        checkEquals("status", expectedStatus, actual.status);
        checkEquals("valueSnapshot", expectedValueSnapshot, actual.valueSnapshot);
        checkEquals("exceptionClass", expectedExceptionClass, actual.exceptionClass);
        checkEquals("stdout", expectedStdout, actual.stdout);
        checkEquals("stderr", expectedStderr, actual.stderr);
        checkEquals("originalInputsSnapshot", expectedOriginalInputsSnapshot, actual.originalInputsSnapshot);
        checkEquals("inputAfterSnapshot", expectedInputAfterSnapshot, actual.inputAfterSnapshot);
    }

    static void assertCoreOutcome(
        InvocationOutcome actual,
        String expectedStatus,
        String expectedValueSnapshot,
        String expectedExceptionClass,
        String expectedOriginalInputsSnapshot,
        String expectedInputAfterSnapshot
    ) {
        checkEquals("status", expectedStatus, actual.status);
        checkEquals("valueSnapshot", expectedValueSnapshot, actual.valueSnapshot);
        checkEquals("exceptionClass", expectedExceptionClass, actual.exceptionClass);
        checkEquals("originalInputsSnapshot", expectedOriginalInputsSnapshot, actual.originalInputsSnapshot);
        checkEquals("inputAfterSnapshot", expectedInputAfterSnapshot, actual.inputAfterSnapshot);
    }

    static void assertEquivalent(InvocationOutcome left, InvocationOutcome right) {
        checkEquals("status", left.status, right.status);
        checkEquals("valueSnapshot", left.valueSnapshot, right.valueSnapshot);
        checkEquals("exceptionClass", left.exceptionClass, right.exceptionClass);
        checkEquals("stdout", left.stdout, right.stdout);
        checkEquals("stderr", left.stderr, right.stderr);
        checkEquals("originalInputsSnapshot", left.originalInputsSnapshot, right.originalInputsSnapshot);
        checkEquals("inputAfterSnapshot", left.inputAfterSnapshot, right.inputAfterSnapshot);
    }

    static void assertInputStatePreserved(InvocationOutcome outcome) {
        checkEquals("inputAfterSnapshot", outcome.originalInputsSnapshot, outcome.inputAfterSnapshot);
    }

    static void assertTextEquals(String label, String expected, String actual) {
        checkEquals(label, expected, actual);
    }

    static void assertTextContains(String label, String expectedSnippet, String actual) {
        if (actual == null || !actual.contains(expectedSnippet)) {
            throw new AssertionError(label + " expected to contain <" + expectedSnippet + "> but was <" + actual + ">");
        }
    }

    static String snapshot(Object value) {
        StringBuilder builder = new StringBuilder();
        appendSnapshot(builder, value);
        return builder.toString();
    }

    static Object textObject(String text) {
        return new ToStringObject(text);
    }

    static Object builder(String text) {
        return new StringBuilder(text);
    }

    static Object atomicInt(int value) {
        return new AtomicInteger(value);
    }

    static Object throwingToStringObject() {
        return new ThrowingToStringObject();
    }

    static <T> ArrayList<T> list(T... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    static <T> Vector<T> vector(T... items) {
        return new Vector<>(Arrays.asList(items));
    }

    static Vector<Double> vectorOfDoubles(double... items) {
        Vector<Double> values = new Vector<>();
        for (double item : items) {
            values.add(item);
        }
        return values;
    }

    static Vector<String> vectorOfStrings(String... items) {
        return new Vector<>(Arrays.asList(items));
    }

    static LinkedHashSet<String> stringSet(String... items) {
        return new LinkedHashSet<>(Arrays.asList(items));
    }

    static <T> LinkedHashSet<T> linkedSet(T... items) {
        return new LinkedHashSet<>(Arrays.asList(items));
    }

    static java.util.Comparator<Object> naturalComparator() {
        return (left, right) -> ((Comparable<Object>) left).compareTo(right);
    }

    static java.util.Comparator<Object> reverseComparator() {
        return (left, right) -> ((Comparable<Object>) right).compareTo(left);
    }

    static Date date(long millis) {
        return new Date(millis);
    }

    static Calendar calendar(long millis) {
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(millis);
        return calendar;
    }

    static Locale locale(String language, String country, String variant) {
        return new Locale(language, country, variant);
    }

    static StringBuffer sb(String value) {
        return new StringBuffer(value);
    }

    static Properties props(String... keyValues) {
        Properties properties = new Properties();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            properties.setProperty(keyValues[i], keyValues[i + 1]);
        }
        return properties;
    }

    static <K, V> Hashtable<K, V> hashtable(Object... keyValues) {
        Hashtable<K, V> table = new Hashtable<>();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            table.put((K) keyValues[i], (V) keyValues[i + 1]);
        }
        return table;
    }

    static <K, V> Map<K, V> map(Object... keyValues) {
        Map<K, V> values = new HashMap<>();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            values.put((K) keyValues[i], (V) keyValues[i + 1]);
        }
        return values;
    }

    static <K, V> HashMap<K, V> hashMap(Object... keyValues) {
        HashMap<K, V> values = new HashMap<>();
        for (int i = 0; i + 1 < keyValues.length; i += 2) {
            values.put((K) keyValues[i], (V) keyValues[i + 1]);
        }
        return values;
    }

    static BitSet bitset(int... bits) {
        BitSet bitSet = new BitSet();
        for (int bit : bits) {
            bitSet.set(bit);
        }
        return bitSet;
    }

    static double[][] d2(double[]... rows) {
        return rows;
    }

    static float[][] f2(float[]... rows) {
        return rows;
    }

    static int[][] i2(int[]... rows) {
        return rows;
    }

    static int[][][] i3(int[][]... planes) {
        return planes;
    }

    static byte[][][] b3(byte[][]... planes) {
        return planes;
    }

    static long[][] longMatrix(int rows, int columns) {
        return new long[rows][columns];
    }

    static long[][] longMatrixSequential(int rows, int columns) {
        long[][] values = new long[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                values[row][column] = (((long) row) << 8) | column;
            }
        }
        return values;
    }

    private static void checkEquals(String label, Object expected, Object actual) {
        if (!Objects.equals(expected, actual)) {
            throw new AssertionError(label + " expected <" + expected + "> but was <" + actual + ">");
        }
    }

    private static Object[] cloneInputs(Object[] inputs) {
        Object[] cloned = new Object[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            cloned[i] = cloneValue(inputs[i]);
        }
        return cloned;
    }

    private static Object cloneValue(Object value) {
        if (value == null
            || value instanceof String
            || value instanceof Number
            || value instanceof Boolean
            || value instanceof Character
            || value instanceof Enum<?>
            || value instanceof Class<?>) {
            return value;
        }
        if (value instanceof ToStringObject textObject) {
            return new ToStringObject(textObject.text);
        }
        if (value instanceof ThrowingToStringObject) {
            return new ThrowingToStringObject();
        }
        if (value instanceof StringBuilder stringBuilder) {
            return new StringBuilder(stringBuilder.toString());
        }
        if (value instanceof StringBuffer stringBuffer) {
            return new StringBuffer(stringBuffer.toString());
        }
        if (value instanceof AtomicInteger atomicInteger) {
            return new AtomicInteger(atomicInteger.get());
        }
        if (value instanceof Date date) {
            return new Date(date.getTime());
        }
        if (value instanceof Calendar calendar) {
            Calendar clone = (Calendar) calendar.clone();
            clone.setTimeZone((TimeZone) calendar.getTimeZone().clone());
            return clone;
        }
        if (value instanceof byte[] bytes) {
            return bytes.clone();
        }
        if (value instanceof short[] shorts) {
            return shorts.clone();
        }
        if (value instanceof int[] ints) {
            return ints.clone();
        }
        if (value instanceof long[] longs) {
            return longs.clone();
        }
        if (value instanceof char[] chars) {
            return chars.clone();
        }
        if (value instanceof float[] floats) {
            return floats.clone();
        }
        if (value instanceof double[] doubles) {
            return doubles.clone();
        }
        if (value instanceof boolean[] booleans) {
            return booleans.clone();
        }
        if (value instanceof Object[] objects) {
            Object[] clone = new Object[objects.length];
            for (int i = 0; i < objects.length; i++) {
                clone[i] = cloneValue(objects[i]);
            }
            return clone;
        }
        if (value instanceof List<?> list) {
            ArrayList<Object> clone = new ArrayList<>(list.size());
            for (Object item : list) {
                clone.add(cloneValue(item));
            }
            return clone;
        }
        if (value instanceof Set<?> set) {
            LinkedHashSet<Object> clone = new LinkedHashSet<>();
            for (Object item : set) {
                clone.add(cloneValue(item));
            }
            return clone;
        }
        if (value instanceof Map<?, ?> map) {
            LinkedHashMap<Object, Object> clone = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                clone.put(cloneValue(entry.getKey()), cloneValue(entry.getValue()));
            }
            return clone;
        }
        return value;
    }

    private static void appendSnapshot(StringBuilder builder, Object value) {
        if (value == null) {
            builder.append("null");
            return;
        }
        if (value instanceof String string) {
            builder.append("String(").append(encodeText(string)).append(")");
            return;
        }
        if (value instanceof Character character) {
            builder.append("Character(").append((int) character.charValue()).append(")");
            return;
        }
        if (value instanceof Byte
            || value instanceof Short
            || value instanceof Integer
            || value instanceof Long
            || value instanceof Float
            || value instanceof Double
            || value instanceof Boolean) {
            builder.append(value.getClass().getSimpleName()).append("(").append(value).append(")");
            return;
        }
        if (value instanceof ToStringObject textObject) {
            builder.append("ToStringObject(").append(encodeText(textObject.text)).append(")");
            return;
        }
        if (value instanceof ThrowingToStringObject) {
            builder.append("ThrowingToStringObject");
            return;
        }
        if (value instanceof StringBuilder stringBuilder) {
            builder.append("StringBuilder(").append(encodeText(stringBuilder.toString())).append(")");
            return;
        }
        if (value instanceof StringBuffer stringBuffer) {
            builder.append("StringBuffer(").append(encodeText(stringBuffer.toString())).append(")");
            return;
        }
        if (value instanceof AtomicInteger atomicInteger) {
            builder.append("AtomicInteger(").append(atomicInteger.get()).append(")");
            return;
        }
        if (value instanceof Date date) {
            builder.append("Date(").append(date.getTime()).append(")");
            return;
        }
        if (value instanceof Calendar calendar) {
            builder.append("Calendar(")
                .append(calendar.getTimeInMillis())
                .append(",")
                .append(encodeText(calendar.getTimeZone().getID()))
                .append(")");
            return;
        }
        if (value instanceof Map<?, ?> map) {
            builder.append(value.getClass().getTypeName()).append("{");
            boolean first = true;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (!first) {
                    builder.append(",");
                }
                first = false;
                appendSnapshot(builder, entry.getKey());
                builder.append("->");
                appendSnapshot(builder, entry.getValue());
            }
            builder.append("}");
            return;
        }
        if (value instanceof Collection<?> collection) {
            builder.append(value.getClass().getTypeName()).append("[");
            boolean first = true;
            for (Object item : collection) {
                if (!first) {
                    builder.append(",");
                }
                first = false;
                appendSnapshot(builder, item);
            }
            builder.append("]");
            return;
        }
        if (value instanceof byte[] bytes) {
            builder.append("byte[]").append(Arrays.toString(bytes));
            return;
        }
        if (value instanceof short[] shorts) {
            builder.append("short[]").append(Arrays.toString(shorts));
            return;
        }
        if (value instanceof int[] ints) {
            builder.append("int[]").append(Arrays.toString(ints));
            return;
        }
        if (value instanceof long[] longs) {
            builder.append("long[]").append(Arrays.toString(longs));
            return;
        }
        if (value instanceof char[] chars) {
            builder.append("char[]").append(Arrays.toString(chars));
            return;
        }
        if (value instanceof float[] floats) {
            builder.append("float[]").append(Arrays.toString(floats));
            return;
        }
        if (value instanceof double[] doubles) {
            builder.append("double[]").append(Arrays.toString(doubles));
            return;
        }
        if (value instanceof boolean[] booleans) {
            builder.append("boolean[]").append(Arrays.toString(booleans));
            return;
        }
        if (value instanceof Object[] objects) {
            builder.append(value.getClass().getTypeName()).append("[");
            for (int i = 0; i < objects.length; i++) {
                if (i > 0) {
                    builder.append(",");
                }
                appendSnapshot(builder, objects[i]);
            }
            builder.append("]");
            return;
        }
        builder.append(value.getClass().getTypeName())
            .append("(")
            .append(encodeText(String.valueOf(value)))
            .append(")");
    }

    private static String encodeText(String value) {
        return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
    }

    private static final class InvocationFailure extends Exception {

        private final Throwable cause;

        private InvocationFailure(Throwable cause) {
            super(cause);
            this.cause = cause;
        }
    }

    private static final class DaemonThreadFactory implements ThreadFactory {

        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("clonepair-generic-invocation");
            return thread;
        }
    }
}
