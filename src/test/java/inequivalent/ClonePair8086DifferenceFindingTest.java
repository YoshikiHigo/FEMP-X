package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair8086DifferenceFindingTest {
    @Test
    void methodsPadWithDifferentCharactersAndSides() {
        ClonePair8086 clonePair = new ClonePair8086();

        assertEquals("a ", clonePair.method1(2, "a"));
        assertEquals("0a", clonePair.method2(2, "a"));
    }
}
