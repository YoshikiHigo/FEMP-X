package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair12517NoDifferenceTest {

    private final ClonePair12517 subject = new ClonePair12517();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{java.util.TimeZone.getTimeZone("UTC")};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs0),
            capture(values -> subject.method2((Object) values[0]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{null};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs1),
            capture(values -> subject.method2((Object) values[0]), caseInputs1)
        );
        Object[] caseInputs2 = new Object[]{java.util.TimeZone.getTimeZone("Asia/Tokyo")};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs2),
            capture(values -> subject.method2((Object) values[0]), caseInputs2)
        );
        Object[] caseInputs3 = new Object[]{java.util.TimeZone.getTimeZone("America/Los_Angeles")};
        assertEquivalent(
            capture(values -> subject.method1((Object) values[0]), caseInputs3),
            capture(values -> subject.method2((Object) values[0]), caseInputs3)
        );
    }
}
