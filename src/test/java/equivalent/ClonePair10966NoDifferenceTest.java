package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair10966NoDifferenceTest {

    private final ClonePair10966 subject = new ClonePair10966();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{String.class, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Object) values[1]), caseInputs0),
            capture(values -> subject.method2((Class) values[0], (Object) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Object) values[1]), caseInputs1),
            capture(values -> subject.method2((Class) values[0], (Object) values[1]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{Integer.class, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Object) values[1]), caseInputs2),
            capture(values -> subject.method2((Class) values[0], (Object) values[1]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{Object.class, Integer.valueOf(7)};
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Object) values[1]), caseInputs3),
            capture(values -> subject.method2((Class) values[0], (Object) values[1]), caseInputs3)
        );
        Object[] caseInputs4 = new Object[]{String.class, ""};
        assertEquivalent(
            capture(values -> subject.method1((Class) values[0], (Object) values[1]), caseInputs4),
            capture(values -> subject.method2((Class) values[0], (Object) values[1]), caseInputs4)
        );
    }
}
