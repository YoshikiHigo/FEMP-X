package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair955NoDifferenceTest {

    private final ClonePair955 subject = new ClonePair955();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(1.0, subject.method1(1.2, true), 0.0);
        assertEquals(1.0, subject.method2(1.2, true), 0.0);

        assertEquals(2.0, subject.method1(2.1, true), 0.0);
        assertEquals(2.0, subject.method2(2.1, true), 0.0);

        assertEquals(5.0, subject.method1(4.0, false), 0.0);
        assertEquals(5.0, subject.method2(4.0, false), 0.0);

        assertEquals(100.0, subject.method1(76.0, true), 0.0);
        assertEquals(100.0, subject.method2(76.0, true), 0.0);
    }
}
