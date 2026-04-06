package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair143DifferenceFindingTest {

    private final ClonePair143 subject = new ClonePair143();

    @Test
    void methodsTreatCaseDifferentlyWhenSearching() {
        Vector<String> genes = new Vector<>();
        genes.add("BRCA1");

        assertEquals(-1, subject.method1(genes, "brca1"));
        assertEquals(0, subject.method2(genes, "brca1"));
    }
}
