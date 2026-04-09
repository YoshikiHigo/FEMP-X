package equivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair50NoDifferenceTest {

    private final ClonePair50 subject = new ClonePair50();

    // ClonePair50 accepts only immutable String inputs, so side-effect checks focus on stdout/stderr.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertSameReturnAndNoOutput(null, null);
        assertSameReturnAndNoOutput("0", 0L);
        assertSameReturnAndNoOutput("010", 10L);
        assertSameReturnAndNoOutput(Long.toString(Long.MAX_VALUE), Long.MAX_VALUE);
        assertSameReturnAndNoOutput(Long.toString(Long.MIN_VALUE), Long.MIN_VALUE);
    }

    @Test
    void noDifferenceFoundForRepresentativeInvalidInputs() {
        assertSameReturnAndNoOutput("", null);
        assertSameReturnAndNoOutput(" 1", null);
        assertSameReturnAndNoOutput("abc", null);
        assertSameReturnAndNoOutput("9223372036854775808", null);
    }

    private void assertSameReturnAndNoOutput(String input, Long expected) {
        InvocationResult method1 = invokeWithCapturedOutput(() -> subject.method1(input));
        InvocationResult method2 = invokeWithCapturedOutput(() -> subject.method2(input));

        assertNull(method1.throwable);
        assertNull(method2.throwable);
        assertEquals(expected, method1.returnValue);
        assertEquals(expected, method2.returnValue);
        assertEquals("", method1.stdout);
        assertEquals("", method1.stderr);
        assertEquals("", method2.stdout);
        assertEquals("", method2.stderr);
    }

    private InvocationResult invokeWithCapturedOutput(ThrowingSupplier<Long> supplier) {
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
        ByteArrayOutputStream capturedErr = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(capturedOut));
            System.setErr(new PrintStream(capturedErr));
            return new InvocationResult(supplier.get(), null, capturedOut.toString(), capturedErr.toString());
        } catch (Throwable throwable) {
            return new InvocationResult(null, throwable, capturedOut.toString(), capturedErr.toString());
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }
    }

    @FunctionalInterface
    private interface ThrowingSupplier<T> {
        T get() throws Throwable;
    }

    private record InvocationResult(Long returnValue, Throwable throwable, String stdout, String stderr) {
    }
}
