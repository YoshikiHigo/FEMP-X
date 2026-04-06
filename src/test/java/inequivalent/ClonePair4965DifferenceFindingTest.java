package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair4965DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4965 clonePair = new ClonePair4965();

        Properties properties = new Properties();
        properties.setProperty("value", " 1 ");

        assertEquals(1, clonePair.method1(properties, "value", 0));
        assertThrows(NumberFormatException.class, () -> clonePair.method2(properties, "value", 0));
    }
}
