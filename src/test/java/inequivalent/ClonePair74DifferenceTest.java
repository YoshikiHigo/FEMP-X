package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair74DifferenceTest {

    private final ClonePair74 subject = new ClonePair74();

    @Test
    void methodsDivergeOnTabOnlyInput() {
        String input = "\t";

        assertEquals(List.of("\t"), subject.method1(input));
        assertEquals(List.of(), subject.method2(input));
    }
}
