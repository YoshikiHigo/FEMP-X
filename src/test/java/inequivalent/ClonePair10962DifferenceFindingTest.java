package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10962DifferenceFindingTest {
    @Test
    void methodsUseDifferentFallbackProperties() {
        ClonePair10962 clonePair = new ClonePair10962();
        Properties properties = new Properties();
        properties.setProperty("value.Min", "5.0");

        assertEquals(1.0, clonePair.method1(properties, "value", 1.0));
        assertEquals(5.0, clonePair.method2(properties, "value", 1.0));
    }
}
