package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7504NoDifferenceTest {

    private final ClonePair7504 subject = new ClonePair7504();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{list()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), caseInputs0),
            capture(values -> subject.method2((java.util.List) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), caseInputs1),
            capture(values -> subject.method2((java.util.List) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{list(Double.valueOf(1.0))};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), caseInputs2),
            capture(values -> subject.method2((java.util.List) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{list(Double.valueOf(1.0), Double.valueOf(2.0))};
        assertEquivalent(
            capture(values -> subject.method1((java.util.List) values[0]), caseInputs3),
            capture(values -> subject.method2((java.util.List) values[0]), caseInputs3)
        );
    }
}
