package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ClonePair5999DifferenceFindingTest {
    @Test
    void onlyMethod1AvoidsAddingDuplicateElements() {
        ClonePair5999 clonePair = new ClonePair5999();
        Vector<String> method1Values = new Vector<>();
        method1Values.add("a");
        Vector<String> method2Values = new Vector<>();
        method2Values.add("a");
        Vector<String> additions = new Vector<>();
        additions.add("a");

        assertSame(method1Values, clonePair.method1(method1Values, additions));
        assertSame(method2Values, clonePair.method2(method2Values, additions));
        assertEquals(1, method1Values.size());
        assertEquals(2, method2Values.size());
    }
}
