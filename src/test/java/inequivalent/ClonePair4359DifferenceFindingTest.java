package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4359DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4359 clonePair = new ClonePair4359();

        Date first = new Date(1_000L);
        Date second = new Date(2_000L);

        assertFalse(clonePair.method1(first, second));
        assertTrue(clonePair.method2(first, second));
    }
}
