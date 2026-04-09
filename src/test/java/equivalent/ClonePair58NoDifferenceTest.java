package equivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair58NoDifferenceTest {

    private final ClonePair58 subject = new ClonePair58();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals("", subject.method1(List.of(), ","));
        assertEquals("", subject.method2(List.of(), ","));

        List<String> values = Arrays.asList("a", null, "b");
        assertEquals("a,null,b", subject.method1(values, ","));
        assertEquals("a,null,b", subject.method2(values, ","));

        assertEquals("anullb", subject.method1(List.of("a", "b"), null));
        assertEquals("anullb", subject.method2(List.of("a", "b"), null));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, ","));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, ","));
    }
}
