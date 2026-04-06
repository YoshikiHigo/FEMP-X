package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1907DifferenceFindingTest {

    private final ClonePair1907 subject = new ClonePair1907();

    @Test
    void methodsPreferFirefoxDifferently() {
        assertEquals("Firefox", subject.method1(List.of("Chrome", "Firefox")));
        assertEquals("Chrome", subject.method2(List.of("Chrome", "Firefox")));
    }
}
