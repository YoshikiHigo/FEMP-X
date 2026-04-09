package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair952NoDifferenceTest {

    private final ClonePair952 subject = new ClonePair952();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(subject.method1(0.0, true), subject.method2(0.0, true), 0.0);
        assertEquals(subject.method1(1.0, true), subject.method2(1.0, true), 0.0);
        assertEquals(subject.method1(-1.0, false), subject.method2(-1.0, false), 0.0);
        assertEquals(subject.method1(20.0, true), subject.method2(20.0, true), 0.0);
        assertEquals(subject.method1(20.0, false), subject.method2(20.0, false), 0.0);
    }
}
