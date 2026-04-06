package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ClonePair2618DifferenceFindingTest {

    private final ClonePair2618 subject = new ClonePair2618();

    @Test
    void methodsHandleLastTokenDifferently() {
        assertArrayEquals(new String[]{"a", ""}, subject.method1("a,b", ","));
        assertArrayEquals(new String[]{"a", "b"}, subject.method2("a,b", ","));
    }
}
