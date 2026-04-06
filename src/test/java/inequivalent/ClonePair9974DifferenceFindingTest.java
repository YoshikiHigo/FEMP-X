package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair9974DifferenceFindingTest {
    @Test
    void methodsRepresentEmptyDelimitedFieldsDifferently() {
        ClonePair9974 clonePair = new ClonePair9974();

        assertArrayEquals(new String[]{"", ""}, clonePair.method1(",", ','));
        assertArrayEquals(new String[]{null, null}, clonePair.method2(",", ','));
    }
}
