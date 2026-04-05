package equivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4731DifferenceTest {

    private final ClonePair4731 subject = new ClonePair4731();

    @Test
    void methodsDivergeOnGeneratedCounterexample() {
        boolean diverged = false;
        for (int attempt = 0; attempt < 64; attempt++) {
            String[] left = subject.method1(new String[]{"a", "b", "c"}, 2, 2);
            String[] right = subject.method2(new String[]{"a", "b", "c"}, 2, 2);
            if (!Arrays.equals(left, right)) {
                diverged = true;
                break;
            }
        }
        assertTrue(diverged);
    }
}
