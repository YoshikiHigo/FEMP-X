package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair12828DifferenceFindingTest {
    @Test
    void onlyMethod2TrimsSelectedItem() {
        ClonePair12828 clonePair = new ClonePair12828();
        String[] items = {" a "};

        assertEquals(" a ", clonePair.method1(items, 0));
        assertEquals("a", clonePair.method2(items, 0));
    }
}
