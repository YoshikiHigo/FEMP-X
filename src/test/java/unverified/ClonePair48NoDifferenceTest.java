package unverified;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair48NoDifferenceTest {

    private final ClonePair48 subject = new ClonePair48();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null));
        assertNull(subject.method2(null));

        assertEquals(Long.valueOf(42L), subject.method1("42"));
        assertEquals(Long.valueOf(42L), subject.method2("42"));

        assertEquals(Long.valueOf(10L), subject.method1("010"));
        assertEquals(Long.valueOf(10L), subject.method2("010"));
    }

    @Test
    void noDifferenceFoundForRepresentativeInvalidInputs() {
        assertNull(subject.method1(""));
        assertNull(subject.method2(""));

        assertNull(subject.method1("bad"));
        assertNull(subject.method2("bad"));

        assertNull(subject.method1(" 42 "));
        assertNull(subject.method2(" 42 "));
    }
}
