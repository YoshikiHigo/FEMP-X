package equivalent;

import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.Vector;

final class ClonePairDifferenceTestSupport {

    private ClonePairDifferenceTestSupport() {
    }

    @FunctionalInterface
    interface ThrowingRunnable {
        void run() throws Throwable;
    }

    static void assertExpected(Object expected, Object actual) {
        if (expected instanceof double[] expectedArray && actual instanceof double[] actualArray) {
            Assertions.assertArrayEquals(expectedArray, actualArray, 1.0e-9);
            return;
        }
        if (expected instanceof float[] expectedArray && actual instanceof float[] actualArray) {
            Assertions.assertArrayEquals(expectedArray, actualArray, 1.0e-6f);
            return;
        }
        if (expected instanceof int[] expectedArray && actual instanceof int[] actualArray) {
            Assertions.assertArrayEquals(expectedArray, actualArray);
            return;
        }
        if (expected instanceof long[] expectedArray && actual instanceof long[] actualArray) {
            Assertions.assertArrayEquals(expectedArray, actualArray);
            return;
        }
        if (expected instanceof short[] expectedArray && actual instanceof short[] actualArray) {
            Assertions.assertArrayEquals(expectedArray, actualArray);
            return;
        }
        if (expected instanceof byte[] expectedArray && actual instanceof byte[] actualArray) {
            Assertions.assertArrayEquals(expectedArray, actualArray);
            return;
        }
        if (expected instanceof char[] expectedArray && actual instanceof char[] actualArray) {
            Assertions.assertArrayEquals(expectedArray, actualArray);
            return;
        }
        if (expected instanceof boolean[] expectedArray && actual instanceof boolean[] actualArray) {
            Assertions.assertArrayEquals(expectedArray, actualArray);
            return;
        }
        if (expected instanceof Object[] expectedArray && actual instanceof Object[] actualArray) {
            Assertions.assertTrue(Arrays.deepEquals(expectedArray, actualArray));
            return;
        }
        if (expected instanceof StringBuffer expectedBuffer && actual instanceof StringBuffer actualBuffer) {
            Assertions.assertEquals(expectedBuffer.toString(), actualBuffer.toString());
            return;
        }
        if (expected instanceof Calendar expectedCalendar && actual instanceof Calendar actualCalendar) {
            Assertions.assertEquals(expectedCalendar.get(Calendar.YEAR), actualCalendar.get(Calendar.YEAR));
            Assertions.assertEquals(expectedCalendar.get(Calendar.MONTH), actualCalendar.get(Calendar.MONTH));
            Assertions.assertEquals(expectedCalendar.get(Calendar.DAY_OF_MONTH), actualCalendar.get(Calendar.DAY_OF_MONTH));
            Assertions.assertEquals(expectedCalendar.get(Calendar.HOUR_OF_DAY), actualCalendar.get(Calendar.HOUR_OF_DAY));
            Assertions.assertEquals(expectedCalendar.get(Calendar.MINUTE), actualCalendar.get(Calendar.MINUTE));
            return;
        }
        if (expected instanceof Double expectedDouble && actual instanceof Double actualDouble) {
            if (expectedDouble.isNaN()) {
                Assertions.assertTrue(actualDouble.isNaN());
            } else {
                Assertions.assertEquals(expectedDouble, actualDouble, 1.0e-9);
            }
            return;
        }
        if (expected instanceof Float expectedFloat && actual instanceof Float actualFloat) {
            if (expectedFloat.isNaN()) {
                Assertions.assertTrue(actualFloat.isNaN());
            } else {
                Assertions.assertEquals(expectedFloat, actualFloat, 1.0e-6f);
            }
            return;
        }
        if (expected instanceof Double[][] expectedArray && actual instanceof Double[][] actualArray) {
            Assertions.assertTrue(Arrays.deepEquals(expectedArray, actualArray));
            return;
        }
        Assertions.assertEquals(expected, actual);
    }

    static void assertExpectedSerialized(String expectedBase64, Object actual) {
        assertExpected(deserialize(expectedBase64), actual);
    }

    static Object deserialize(String expectedBase64) {
        try (ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(expectedBase64)))) {
            return input.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            throw new IllegalStateException(exception);
        }
    }

    static void assertThrowsByName(String expectedClassName, ThrowingRunnable runnable) {
        Throwable throwable = Assertions.assertThrows(Throwable.class, runnable::run);
        Assertions.assertEquals(expectedClassName, throwable.getClass().getName());
    }

    static <T> ArrayList<T> list(T... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    static <T> List<T> immutableList(T... items) {
        return Collections.unmodifiableList(Arrays.asList(items));
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

    static Comparator<Object> naturalComparator() {
        return (left, right) -> ((Comparable<Object>) left).compareTo(right);
    }

    static Comparator<Object> reverseComparator() {
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

    static boolean[][] b2(boolean[]... rows) {
        return rows;
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

    static Locale locale(String language, String country, String variant) {
        return new Locale(language, country, variant);
    }

    static Throwable equalThrowable(String message, int id, Throwable cause) {
        return new EqualThrowable(message, id, cause);
    }

    private static final class EqualThrowable extends Throwable {

        private final int id;

        private EqualThrowable(String message, int id, Throwable cause) {
            super(message, cause);
            this.id = id;
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof EqualThrowable that)) {
                return false;
            }
            return id == that.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }
    }
}
