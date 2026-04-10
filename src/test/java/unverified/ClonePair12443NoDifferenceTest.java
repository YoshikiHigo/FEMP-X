package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair12443NoDifferenceTest {

    private final ClonePair12443 subject = new ClonePair12443();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{""}),
            capture(values -> subject.method2((String) values[0]), new Object[]{""})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{null}),
            capture(values -> subject.method2((String) values[0]), new Object[]{null})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"ab"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"ab"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"ab_CD"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"ab_CD"})
        );
        assertEquivalent(
            capture(values -> subject.method1((String) values[0]), new Object[]{"ab_CD_VAR"}),
            capture(values -> subject.method2((String) values[0]), new Object[]{"ab_CD_VAR"})
        );
    }
}
