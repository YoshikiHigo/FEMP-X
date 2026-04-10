package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair2751NoDifferenceTest {

    private final ClonePair2751 subject = new ClonePair2751();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((StackTraceElement[]) values[0], (StackTraceElement[]) values[1]), new Object[]{new StackTraceElement[]{}, new StackTraceElement[]{}}),
            capture(values -> subject.method2((StackTraceElement[]) values[0], (StackTraceElement[]) values[1]), new Object[]{new StackTraceElement[]{}, new StackTraceElement[]{}})
        );
        assertEquivalent(
            capture(values -> subject.method1((StackTraceElement[]) values[0], (StackTraceElement[]) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((StackTraceElement[]) values[0], (StackTraceElement[]) values[1]), new Object[]{null, null})
        );
    }
}
