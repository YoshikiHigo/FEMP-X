package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair8079DifferenceFindingTest {
    @Test
    void methodsHandleOverflowingEndIndexDifferently() {
        ClonePair8079 clonePair = new ClonePair8079();
        char[] source = {'a'};
        char[] target = {'a'};

        assertTrue(clonePair.method1(source, Integer.MAX_VALUE, target, 0, 1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> clonePair.method2(source, Integer.MAX_VALUE, target, 0, 1));
    }
}
