package equivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1830NoDifferenceTest {

    private final ClonePair1830 subject = new ClonePair1830();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals("", subject.method1(List.of()));
        assertEquals("", subject.method2(List.of()));

        List<String> values = Arrays.asList("a", null, "b");
        assertEquals("a\nnull\nb\n", subject.method1(values));
        assertEquals("a\nnull\nb\n", subject.method2(values));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
