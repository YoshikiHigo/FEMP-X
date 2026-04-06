package inequivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class ClonePair4864DifferenceFindingTest {
    @Test
    void testDifference() {
        ClonePair4864 clonePair = new ClonePair4864();

        assertThrows(
                AssertionFailedError.class,
                () -> assertTimeoutPreemptively(Duration.ofMillis(100), () -> clonePair.method1(-1, 0))
        );
        assertThrows(ArithmeticException.class, () -> clonePair.method2(-1, 0));
    }
}
