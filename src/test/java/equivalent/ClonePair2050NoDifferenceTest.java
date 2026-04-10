package equivalent;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair2050NoDifferenceTest {

    private final ClonePair2050 subject = new ClonePair2050();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertSameReturnAndNoSideEffects(true, new byte[]{}, new byte[]{});
        assertSameReturnAndNoSideEffects(true, new byte[]{1, 2, 3}, new byte[]{1, 2, 3});
        assertSameReturnAndNoSideEffects(false, new byte[]{1, 2, 3}, new byte[]{1, 2, 4});
        assertSameReturnAndNoSideEffects(false, new byte[]{1}, new byte[]{1, 2});
        assertSameReturnAndNoSideEffects(false, null, new byte[]{1});
        assertSameReturnAndNoSideEffects(false, new byte[]{1}, null);
        assertSameReturnAndNoSideEffects(false, null, null);
    }

    private void assertSameReturnAndNoSideEffects(boolean expected, byte[] first, byte[] second) {
        InvocationResult method1 = invokeWithCapturedOutput(first, second, subject::method1);
        InvocationResult method2 = invokeWithCapturedOutput(first, second, subject::method2);

        assertEquals(Boolean.valueOf(expected), method1.returnValue);
        assertEquals(Boolean.valueOf(expected), method2.returnValue);
        assertNull(method1.throwable);
        assertNull(method2.throwable);
        assertEquals("", method1.stdout);
        assertEquals("", method1.stderr);
        assertEquals("", method2.stdout);
        assertEquals("", method2.stderr);
        assertInputPreserved(first, method1.firstAfter);
        assertInputPreserved(second, method1.secondAfter);
        assertInputPreserved(first, method2.firstAfter);
        assertInputPreserved(second, method2.secondAfter);
    }

    private void assertInputPreserved(byte[] before, byte[] after) {
        if (before == null) {
            assertNull(after);
            return;
        }
        assertArrayEquals(before, after);
    }

    private InvocationResult invokeWithCapturedOutput(byte[] first, byte[] second, ByteArrayPairInvocation invocation) {
        byte[] actualFirst = cloneInput(first);
        byte[] actualSecond = cloneInput(second);
        PrintStream originalOut = System.out;
        PrintStream originalErr = System.err;
        ByteArrayOutputStream capturedOut = new ByteArrayOutputStream();
        ByteArrayOutputStream capturedErr = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(capturedOut));
            System.setErr(new PrintStream(capturedErr));
            Boolean returnValue = invocation.invoke(actualFirst, actualSecond);
            return new InvocationResult(returnValue, null, capturedOut.toString(), capturedErr.toString(), cloneInput(actualFirst), cloneInput(actualSecond));
        } catch (Throwable throwable) {
            return new InvocationResult(null, throwable, capturedOut.toString(), capturedErr.toString(), cloneInput(actualFirst), cloneInput(actualSecond));
        } finally {
            System.setOut(originalOut);
            System.setErr(originalErr);
        }
    }

    private byte[] cloneInput(byte[] input) {
        return input == null ? null : input.clone();
    }

    @FunctionalInterface
    private interface ByteArrayPairInvocation {
        boolean invoke(byte[] first, byte[] second) throws Throwable;
    }

    private record InvocationResult(
        Boolean returnValue,
        Throwable throwable,
        String stdout,
        String stderr,
        byte[] firstAfter,
        byte[] secondAfter
    ) {
    }
}
