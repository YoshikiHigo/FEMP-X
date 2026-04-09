package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static unverified.ClonePairDifferenceTestSupport.assertThrowsByName;

class ClonePair95NoDifferenceTest {

    private final ClonePair95 subject = new ClonePair95();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        Object[] args = {"zero", "one", null};

        assertEquals("one", subject.method1("{1}", args));
        assertEquals("one", subject.method2("{1}", args));

        assertEquals("{1}", subject.method1("\\{1}", args));
        assertEquals("{1}", subject.method2("\\{1}", args));

        assertEquals("<null>", subject.method1("{2}", args));
        assertEquals("<null>", subject.method2("{2}", args));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, new Object[0]));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, new Object[0]));
    }
}
