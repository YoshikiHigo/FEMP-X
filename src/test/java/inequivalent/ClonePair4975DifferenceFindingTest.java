package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair4975DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4975 clonePair = new ClonePair4975();

        assertEquals(List.of("2147483648"), clonePair.method1("2147483648", "2147483648", "1"));
        assertThrows(NumberFormatException.class, () -> clonePair.method2("2147483648", "2147483648", "1"));
    }
}
