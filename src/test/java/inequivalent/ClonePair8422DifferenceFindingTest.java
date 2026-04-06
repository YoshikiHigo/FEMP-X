package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair8422DifferenceFindingTest {
    @Test
    void methodsHandleSecondsSuffixDifferently() {
        ClonePair8422 clonePair = new ClonePair8422();

        assertThrows(NumberFormatException.class, () -> clonePair.method1("1(sec)"));
        assertEquals(1.0, clonePair.method2("1(sec)"));
    }
}
