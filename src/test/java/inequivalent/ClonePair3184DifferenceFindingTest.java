package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3184DifferenceFindingTest {

    private final ClonePair3184 subject = new ClonePair3184();

    @Test
    void methodsPlacePositiveEntriesDifferently() {
        double[][] input = {{1.0, 2.0}, {3.0, 4.0}};

        double[][] method1 = subject.method1(input);
        double[][] method2 = subject.method2(input);

        assertEquals(1.0, method1[0][0]);
        assertEquals(2.0, method1[0][1]);
        assertEquals(3.0, method1[1][0]);
        assertEquals(0.0, method2[0][0]);
        assertEquals(1.0, method2[1][0]);
    }
}
