package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair72NoDifferenceTest {

    private final ClonePair72 subject = new ClonePair72();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(Boolean.TRUE, subject.method1("yes", Boolean.FALSE));
        assertEquals(Boolean.TRUE, subject.method2("yes", Boolean.FALSE));

        assertEquals(Boolean.FALSE, subject.method1("OFF", Boolean.TRUE));
        assertEquals(Boolean.FALSE, subject.method2("OFF", Boolean.TRUE));

        assertEquals(Boolean.TRUE, subject.method1("maybe", Boolean.TRUE));
        assertEquals(Boolean.TRUE, subject.method2("maybe", Boolean.TRUE));

        assertNull(subject.method1(null, null));
        assertNull(subject.method2(null, null));
    }
}
