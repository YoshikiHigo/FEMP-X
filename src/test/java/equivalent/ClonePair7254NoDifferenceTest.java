package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7254NoDifferenceTest {

    private final ClonePair7254 subject = new ClonePair7254();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{"", '\0'};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue()), caseInputs0),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue()), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null, '\0'};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue()), caseInputs1),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue()), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{"a", 'a'};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue()), caseInputs2),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue()), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{"a.b.c", '.'};
        assertEquivalent(
            capture(values -> subject.method1((CharSequence) values[0], ((Character) values[1]).charValue()), caseInputs3),
            capture(values -> subject.method2((CharSequence) values[0], ((Character) values[1]).charValue()), caseInputs3)
        );
    }
}
