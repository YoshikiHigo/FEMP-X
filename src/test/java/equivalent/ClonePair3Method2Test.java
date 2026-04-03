package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClonePair3Method2Test {

    private final ClonePair3 subject = new ClonePair3();

    @Test
    void method2ReturnsFollowingValueWhenNameAppearsFirst() {
        assertEquals("8080", subject.method2(new String[]{"--port", "8080", "--host", "localhost"}, "--port", "default"));
    }

    @Test
    void method2ReturnsFollowingValueWhenNameAppearsLater() {
        assertEquals("localhost", subject.method2(new String[]{"--port", "8080", "--host", "localhost"}, "--host", "default"));
    }

    @Test
    void method2ReturnsDefaultWhenNameIsMissing() {
        assertEquals("fallback", subject.method2(new String[]{"--port", "8080"}, "--host", "fallback"));
    }

    @Test
    void method2ReturnsDefaultForEmptyArgs() {
        assertEquals("fallback", subject.method2(new String[]{}, "--host", "fallback"));
    }

    @Test
    void method2ThrowsWhenMatchIsLastElement() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> subject.method2(new String[]{"--host"}, "--host", "fallback"));
    }

    @Test
    void method2ThrowsWhenArgsArrayIsNull() {
        assertThrows(NullPointerException.class, () -> subject.method2(null, "--host", "fallback"));
    }

    @Test
    void method2ThrowsWhenArrayContainsNullElementBeforeMatchCheck() {
        assertThrows(NullPointerException.class, () -> subject.method2(new String[]{null, "value"}, "--host", "fallback"));
    }
}
