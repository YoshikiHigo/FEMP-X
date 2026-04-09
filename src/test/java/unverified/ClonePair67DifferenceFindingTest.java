package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair67DifferenceFindingTest {

    private final ClonePair67 subject = new ClonePair67();

    @Test
    void methodsDisagreeWhenTheFirstListElementIsNull() {
        java.util.List<String> input = java.util.Arrays.asList((String) null, "b");

        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(input, ","));
        assertEquals("null,b", subject.method2(input, ","));
    }
}
