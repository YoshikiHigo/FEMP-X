package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7852NoDifferenceTest {

    private final ClonePair7852 subject = new ClonePair7852();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{list()};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0]), caseInputs0),
            capture(values -> subject.method2((java.util.Collection) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0]), caseInputs1),
            capture(values -> subject.method2((java.util.Collection) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{list("alpha")};
        assertEquivalent(
            capture(values -> subject.method1((java.util.Collection) values[0]), caseInputs2),
            capture(values -> subject.method2((java.util.Collection) values[0]), caseInputs2)
        );
    }
}
