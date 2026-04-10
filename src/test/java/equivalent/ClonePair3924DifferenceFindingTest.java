package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair3924DifferenceFindingTest {

    private final ClonePair3924 subject = new ClonePair3924();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertEquals("aa", subject.method1("aa", new String[]{"aa"}, new String[]{"aa", "xx"}));
        assertThrows(AssertionFailedError.class, () ->
            assertTimeoutPreemptively(Duration.ofMillis(200), () -> subject.method2("aa", new String[]{"aa"}, new String[]{"aa", "xx"})));
    }
}
