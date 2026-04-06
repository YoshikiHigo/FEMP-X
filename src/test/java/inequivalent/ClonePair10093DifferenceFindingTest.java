package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair10093DifferenceFindingTest {
    @Test
    void method2ThrowsOnSecondReplacementButMethod1DoesNot() {
        ClonePair10093 clonePair = new ClonePair10093();

        assertEquals("xx", clonePair.method1("aa", "a", "x"));
        assertThrows(IndexOutOfBoundsException.class, () -> clonePair.method2("aa", "a", "x"));
    }
}
