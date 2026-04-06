package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair10744DifferenceFindingTest {
    @Test
    void methodsHandleStartMarkerAtBeginningDifferently() {
        ClonePair10744 clonePair = new ClonePair10744();

        assertEquals("", clonePair.method1("<a>", "<", ">"));
        assertEquals("a", clonePair.method2("<a>", "<", ">"));
    }
}
