package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair3Method1Test {

    private final ClonePair3 subject = new ClonePair3();

    @Test
    void method1ReturnsFollowingValueWhenNameAppearsFirst() {
        assertEquals("8080", subject.method1(new String[]{"--port", "8080", "--host", "localhost"}, "--port", "default"));
    }

    @Test
    void method1ReturnsFollowingValueWhenNameAppearsLater() {
        assertEquals("localhost", subject.method1(new String[]{"--port", "8080", "--host", "localhost"}, "--host", "default"));
    }

    @Test
    void method1ReturnsDefaultWhenNameIsMissing() {
        assertEquals("fallback", subject.method1(new String[]{"--port", "8080"}, "--host", "fallback"));
    }

    @Test
    void method1ReturnsDefaultForEmptyArgs() {
        assertEquals("fallback", subject.method1(new String[]{}, "--host", "fallback"));
    }

    @Test
    void method1ThrowsWhenMatchIsLastElement() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> subject.method1(new String[]{"--host"}, "--host", "fallback"));
    }

    @Test
    void method1ThrowsWhenArgsArrayIsNull() {
        assertThrows(NullPointerException.class, () -> subject.method1(null, "--host", "fallback"));
    }

    @Test
    void method1ThrowsWhenArrayContainsNullElementBeforeMatchCheck() {
        assertThrows(NullPointerException.class, () -> subject.method1(new String[]{null, "value"}, "--host", "fallback"));
    }
}
