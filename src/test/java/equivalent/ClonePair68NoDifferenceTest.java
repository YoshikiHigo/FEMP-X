package equivalent;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair68NoDifferenceTest {

    private final ClonePair68 subject = new ClonePair68();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        HashMap<String, Integer> ascendingInput1 = new HashMap<>();
        ascendingInput1.put("b", 2);
        ascendingInput1.put("a", 1);
        HashMap<String, Integer> ascendingInput2 = new HashMap<>(ascendingInput1);

        LinkedHashMap<?, ?> ascendingResult1 = subject.method1(ascendingInput1, true);
        LinkedHashMap<?, ?> ascendingResult2 = subject.method2(ascendingInput2, true);
        assertEquals(ascendingResult1, ascendingResult2);
        assertEquals(ascendingResult1.toString(), "{a=1, b=2}");
        assertTrue(ascendingInput1.isEmpty());
        assertTrue(ascendingInput2.isEmpty());

        HashMap<String, Integer> descendingInput1 = new HashMap<>();
        descendingInput1.put("b", 2);
        descendingInput1.put("a", 1);
        HashMap<String, Integer> descendingInput2 = new HashMap<>(descendingInput1);

        LinkedHashMap<?, ?> descendingResult1 = subject.method1(descendingInput1, false);
        LinkedHashMap<?, ?> descendingResult2 = subject.method2(descendingInput2, false);
        assertEquals(descendingResult1, descendingResult2);
        assertEquals(descendingResult1.toString(), "{b=2, a=1}");
        assertTrue(descendingInput1.isEmpty());
        assertTrue(descendingInput2.isEmpty());
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, true));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, true));
    }
}
