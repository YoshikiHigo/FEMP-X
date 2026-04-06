package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair139DifferenceFindingTest {

    private final ClonePair139 subject = new ClonePair139();

    @Test
    void methodsChooseOppositeExtremaForNaturalOrderComparator() {
        Double[] values = {1.0, 2.0};
        Comparator<Double> comparator = Double::compareTo;

        assertEquals(2.0, subject.method1(values, comparator));
        assertEquals(1.0, subject.method2(values, comparator));
    }
}
