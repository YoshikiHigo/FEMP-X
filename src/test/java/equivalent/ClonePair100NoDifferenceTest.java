package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair100NoDifferenceTest {

    private final ClonePair100 subject = new ClonePair100();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertSameResult(0, 0, 5, 10, 6, 8, 0);
        assertSameResult(-2, 1, 5, 10, 2, 1, 0);
        assertSameResult(2, 1, 5, 10, 4, 20, 15);
        assertSameResult(2, 1, 5, 10, 7, 20, 9);
        assertSameResult(2, 1, 5, 10, 10, 20, 3);
        assertSameResult(5, 1, 1, 1, 4, 9, 0);
    }

    private void assertSameResult(int p1, int p2, int a1, int a2, int b1, int b2, int expected) {
        assertEquals(expected, subject.method1(p1, p2, a1, a2, b1, b2));
        assertEquals(expected, subject.method2(p1, p2, a1, a2, b1, b2));
    }
}
