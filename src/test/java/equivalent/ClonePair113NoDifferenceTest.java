package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair113NoDifferenceTest {

    private final ClonePair113 subject = new ClonePair113();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(0.0, subject.method1(0.0, 10.0, 0.0));
        assertEquals(0.0, subject.method2(0.0, 10.0, 0.0));

        assertEquals(0.5, subject.method1(0.0, 10.0, 0.7), 1.0e-12);
        assertEquals(0.5, subject.method2(0.0, 10.0, 0.7), 1.0e-12);

        assertEquals(2.0, subject.method1(10.0, 0.0, -1.8));
        assertEquals(2.0, subject.method2(10.0, 0.0, -1.8));

        assertEquals(100.0, subject.method1(0.0, 1.0, 76.0));
        assertEquals(100.0, subject.method2(0.0, 1.0, 76.0));
    }
}
