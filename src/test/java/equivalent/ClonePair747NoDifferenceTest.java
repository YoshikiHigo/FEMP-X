package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair747NoDifferenceTest {

    private final ClonePair747 subject = new ClonePair747();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals(7L, subject.method1(null, 7L));
        assertEquals(7L, subject.method2(null, 7L));

        assertEquals(7L, subject.method1("", 7L));
        assertEquals(7L, subject.method2("", 7L));

        assertEquals(7L, subject.method1(" ", 7L));
        assertEquals(7L, subject.method2(" ", 7L));

        assertEquals(42L, subject.method1("42", 7L));
        assertEquals(42L, subject.method2("42", 7L));

        assertEquals(7L, subject.method1("x", 7L));
        assertEquals(7L, subject.method2("x", 7L));
    }
}
