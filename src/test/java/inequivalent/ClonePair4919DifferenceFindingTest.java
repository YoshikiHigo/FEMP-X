package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair4919DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4919 clonePair = new ClonePair4919();

        String value = "2020/01/02:03.04";

        assertNull(clonePair.method1(value));
        assertNotNull(clonePair.method2(value));
    }
}
