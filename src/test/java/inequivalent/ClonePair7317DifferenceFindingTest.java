package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair7317DifferenceFindingTest {
    @Test
    void methodsReturnMeanAndSumDifferently() {
        ClonePair7317 clonePair = new ClonePair7317();
        Vector<Double> samples = new Vector<>();
        samples.add(1.0);
        samples.add(3.0);

        assertEquals(2.0, clonePair.method1(samples));
        assertEquals(4.0, clonePair.method2(samples));
    }
}
