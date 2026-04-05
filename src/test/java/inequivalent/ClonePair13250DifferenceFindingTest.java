package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair13250DifferenceFindingTest {

    private final ClonePair13250 subject = new ClonePair13250();

    @Test
    void methodsTreatSingleOpeningQuoteDifferently() {
        assertArrayEquals(new String[]{}, subject.method1("\""));
        assertArrayEquals(new String[]{""}, subject.method2("\""));
    }
}
