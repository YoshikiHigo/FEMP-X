package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair8080NoDifferenceTest {

    private final ClonePair8080 subject = new ClonePair8080();

    @Test
    void nullCounterStillThrowsInBothMethods() {
        assertThrows(NullPointerException.class, () -> subject.method1("-", "", "bar", null));
        assertThrows(NullPointerException.class, () -> subject.method2("-", "", "bar", null));
    }
}
