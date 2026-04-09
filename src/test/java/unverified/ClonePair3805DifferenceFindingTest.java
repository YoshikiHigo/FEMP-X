package unverified;

import org.junit.jupiter.api.Test;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair3805DifferenceFindingTest {

    private final ClonePair3805 subject = new ClonePair3805();

    @Test
    void methodsDisagreeOnGeneratedInput() {
        InvocationOutcome method1Outcome = capture(values -> subject.method1((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", "Key:\"Value\";Other:Two"});
        InvocationOutcome method2Outcome = capture(values -> subject.method2((String) values[0], (String) values[1]), new Object[]{"Key:\"Value\";Other:Two", "Key:\"Value\";Other:Two"});

        assertOutcome(
            method1Outcome,
            "OK",
            "Boolean(false)",
            null,
            "",
            "",
            "java.lang.Object[][String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv),String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv)]",
            "java.lang.Object[][String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv),String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv)]"
        );
        assertOutcome(
            method2Outcome,
            "OK",
            "Boolean(true)",
            null,
            "",
            "",
            "java.lang.Object[][String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv),String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv)]",
            "java.lang.Object[][String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv),String(S2V5OiJWYWx1ZSI7T3RoZXI6VHdv)]"
        );
    }
}
