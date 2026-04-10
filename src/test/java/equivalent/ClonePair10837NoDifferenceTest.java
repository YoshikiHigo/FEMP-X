package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10837NoDifferenceTest {

    private final ClonePair10837 subject = new ClonePair10837();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"a", new char[]{}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1]), caseInputs0),
            capture(values -> subject.method2((String) values[0], (char[]) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{"a", new char[]{'a'}};
        assertEquivalent(
            capture(values -> subject.method1((String) values[0], (char[]) values[1]), caseInputs1),
            capture(values -> subject.method2((String) values[0], (char[]) values[1]), caseInputs1)
        );
    }
}
