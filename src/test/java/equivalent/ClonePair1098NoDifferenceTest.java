package equivalent;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1098NoDifferenceTest {

    private final ClonePair1098 subject = new ClonePair1098();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        Vector<String> keys1 = new Vector<>();
        keys1.add("x");
        keys1.add("y");
        Vector<String> keys2 = new Vector<>(keys1);
        String[] data1 = {"10", "20", "30"};
        String[] data2 = data1.clone();
        String[] scheme1 = {"a.x", "a.z", "b.y"};
        String[] scheme2 = scheme1.clone();

        assertArrayEquals(new int[]{10, 30}, subject.method1(keys1, data1, scheme1));
        assertArrayEquals(new int[]{10, 30}, subject.method2(keys2, data2, scheme2));
        assertEquals(keys1, keys2);
        assertArrayEquals(data1, data2);
        assertArrayEquals(scheme1, scheme2);
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        Vector<String> keys = new Vector<>();
        keys.add("x");
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method1(keys, new String[]{"x"}, new String[]{"a.x"}));
        assertThrowsByName("java.lang.NumberFormatException", () -> subject.method2(keys, new String[]{"x"}, new String[]{"a.x"}));
    }
}
