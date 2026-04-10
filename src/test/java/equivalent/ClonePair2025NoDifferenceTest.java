package equivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair2025NoDifferenceTest {

    private final ClonePair2025 subject = new ClonePair2025();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertSameReturnAndNoSideEffects(0, new byte[]{0, 0, 0, 0});
        assertSameReturnAndNoSideEffects(16909060, new byte[]{1, 2, 3, 4});
        assertSameReturnAndNoSideEffects(Integer.MIN_VALUE, new byte[]{(byte) 0x80, 0, 0, 0});
        assertSameReturnAndNoSideEffects(-1, new byte[]{(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff});
        assertSameReturnAndNoSideEffects(16909060, new byte[]{1, 2, 3, 4, 5});
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertSameExceptionAndNoSideEffects(NullPointerException.class, null);
        assertSameExceptionAndNoSideEffects(ArrayIndexOutOfBoundsException.class, new byte[]{});
        assertSameExceptionAndNoSideEffects(ArrayIndexOutOfBoundsException.class, new byte[]{1, 2, 3});
    }

    private void assertSameReturnAndNoSideEffects(int expected, byte[] input) {
        InvocationResult method1 = invokeWithCapturedOutput(input, subject::method1);
        InvocationResult method2 = invokeWithCapturedOutput(input, subject::method2);

        assertNull(method1.throwable);
        assertNull(method2.throwable);
        assertEquals(expected, method1.returnValue);
        assertEquals(expected, method2.returnValue);
        assertEquals("", method1.stdout);
        assertEquals("", method1.stderr);
        assertEquals("", method2.stdout);
        assertEquals("", method2.stderr);
        assertInputPreserved(input, method1.inputAfter);
        assertInputPreserved(input, method2.inputAfter);
    }

    private void assertSameExceptionAndNoSideEffects(Class<? extends Throwable> expectedType, byte[] input) {
        InvocationResult method1 = invokeWithCapturedOutput(input, subject::method1);
        InvocationResult method2 = invokeWithCapturedOutput(input, subject::method2);

        assertNull(method1.returnValue);
        assertNull(method2.returnValue);
        assertEquals(expectedType, method1.throwable.getClass());
        assertEquals(expectedType, method2.throwable.getClass());
        assertEquals("", method1.stdout);
        assertEquals("", method1.stderr);
        assertEquals("", method2.stdout);
        assertEquals("", method2.stderr);
        assertInputPreserved(input, method1.inputAfter);
        assertInputPreserved(input, method2.inputAfter);
    }

    private void assertInputPreserved(byte[] before, byte[] after) {
        if (before == null) {
            assertNull(after);
            return;
        }
        assertArrayEquals(before, after);
    }

    private InvocationResult invokeWithCapturedOutput(byte[] input, ByteArrayInvocation invocation) {
        byte[] actualInput = input == null ? null : input.clone();
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
        ByteArrayOutputStream capturedErr = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(capturedOut));
            System.setErr(new PrintStream(capturedErr));
            Integer returnValue = invocation.invoke(actualInput);
            return new InvocationResult(returnValue, null, capturedOut.toString(), capturedErr.toString(), cloneInput(actualInput));
        } catch (Throwable throwable) {
            return new InvocationResult(null, throwable, capturedOut.toString(), capturedErr.toString(), cloneInput(actualInput));
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }
    }

    private byte[] cloneInput(byte[] input) {
        return input == null ? null : input.clone();
    }

    @FunctionalInterface
    private interface ByteArrayInvocation {
        int invoke(byte[] input) throws Throwable;
    }

    private record InvocationResult(Integer returnValue, Throwable throwable, String stdout, String stderr, byte[] inputAfter) {
    }
}
