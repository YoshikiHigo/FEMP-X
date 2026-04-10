package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair2990NoDifferenceTest {

    private final ClonePair2990 subject = new ClonePair2990();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertBothMethodsReturn(new String[0], null, ",");
        assertBothMethodsReturn(new String[0], "   ", ",");
        assertBothMethodsReturn(new String[]{"a", "b"}, "a,b", ",");
        assertBothMethodsReturn(new String[]{"a", "b"}, " a | b ", "|");
    }

    private void assertBothMethodsReturn(String[] expected, String prop, String separator) {
        assertArrayEquals(expected, subject.method1(prop, separator));
        assertArrayEquals(expected, subject.method2(prop, separator));
    }
}
