package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair4136DifferenceFindingTest {

    private final ClonePair4136 subject = new ClonePair4136();

    @Test
    void method1OverwritesFirstSlotButMethod2CopiesAllSlots() {
        assertArrayEquals(new String[]{"b", null}, subject.method1(List.of("a", "b")));
        assertArrayEquals(new String[]{"a", "b"}, subject.method2(List.of("a", "b")));
    }
}
