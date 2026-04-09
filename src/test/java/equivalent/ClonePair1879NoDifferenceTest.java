package equivalent;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1879NoDifferenceTest {

    private final ClonePair1879 subject = new ClonePair1879();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        assertEquals("", subject.method1(null));
        assertEquals("", subject.method2(null));

        assertEquals("", subject.method1(List.of()));
        assertEquals("", subject.method2(List.of()));

        List<String> values = Arrays.asList("a", null, "b");
        assertEquals("a,null,b", subject.method1(values));
        assertEquals("a,null,b", subject.method2(values));
    }
}
