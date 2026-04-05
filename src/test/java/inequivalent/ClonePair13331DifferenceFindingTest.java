package inequivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class ClonePair13331DifferenceFindingTest {

    private final ClonePair13331 subject = new ClonePair13331();

    @Test
    void method2DoesNotTerminateWhenFindStringIsEmpty() {
        assertEquals("a", subject.method1("", "", "a"));
        assertThrows(
                AssertionFailedError.class,
                () -> assertTimeoutPreemptively(Duration.ofMillis(100), () -> subject.method2("", "", "a"))
        );
    }
}
