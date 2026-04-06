package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair11457DifferenceFindingTest {
    @Test
    void methodsParseDifferentDateFormats() {
        ClonePair11457 clonePair = new ClonePair11457();
        String value = "01.02.2020 03:04:05";

        assertNotNull(clonePair.method1(value));
        assertThrows(NumberFormatException.class, () -> clonePair.method2(value));
    }
}
