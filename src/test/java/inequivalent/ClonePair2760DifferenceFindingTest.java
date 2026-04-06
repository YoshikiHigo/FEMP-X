package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair2760DifferenceFindingTest {

    private final ClonePair2760 subject = new ClonePair2760();

    @Test
    void methodsChooseModeAndMinimumDifferently() {
        assertEquals(2, subject.method1(List.of(2, 1, 2)));
        assertEquals(1, subject.method2(List.of(2, 1, 2)));
    }
}
