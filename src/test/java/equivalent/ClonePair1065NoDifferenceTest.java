package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1065NoDifferenceTest {

    private final ClonePair1065 subject = new ClonePair1065();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        Object[] values = {"a", null, "b"};
        assertEquals(2, subject.method1(values, "b"));
        assertEquals(2, subject.method2(values, "b"));

        assertEquals(1, subject.method1(values, null));
        assertEquals(1, subject.method2(values, null));

        assertEquals(-1, subject.method1(values, "z"));
        assertEquals(-1, subject.method2(values, "z"));

        assertEquals(-1, subject.method1(null, "a"));
        assertEquals(-1, subject.method2(null, "a"));
    }
}
