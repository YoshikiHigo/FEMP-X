package equivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair59NoDifferenceTest {

    private final ClonePair59 subject = new ClonePair59();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertNull(subject.method1(null, ","));
        assertNull(subject.method2(null, ","));

        assertNull(subject.method1(List.of(), ","));
        assertNull(subject.method2(List.of(), ","));

        List<String> values = Arrays.asList("a", null, "b");
        assertEquals("a,null,b", subject.method1(values, ","));
        assertEquals("a,null,b", subject.method2(values, ","));

        assertEquals("anullnullnullb", subject.method1(values, null));
        assertEquals("anullnullnullb", subject.method2(values, null));
    }
}
