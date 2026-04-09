package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair957NoDifferenceTest {

    private final ClonePair957 subject = new ClonePair957();

    @Test
    void noDifferenceFoundForRepresentativeReturnValuesAndSideEffects() {
        float[] positive1 = {0.0f, 10.0f};
        float[] positive2 = {0.0f, 10.0f};
        assertTrue(subject.method1(2.0f, 4.0f, positive1));
        assertTrue(subject.method2(2.0f, 4.0f, positive2));
        assertArrayEquals(new float[]{2.0f, 10.0f}, positive1);
        assertArrayEquals(new float[]{2.0f, 10.0f}, positive2);

        float[] negative1 = {0.0f, 10.0f};
        float[] negative2 = {0.0f, 10.0f};
        assertTrue(subject.method1(-2.0f, -8.0f, negative1));
        assertTrue(subject.method2(-2.0f, -8.0f, negative2));
        assertArrayEquals(new float[]{0.0f, 4.0f}, negative1);
        assertArrayEquals(new float[]{0.0f, 4.0f}, negative2);

        float[] reject1 = {0.0f, 1.0f};
        float[] reject2 = {0.0f, 1.0f};
        assertFalse(subject.method1(2.0f, 3.0f, reject1));
        assertFalse(subject.method2(2.0f, 3.0f, reject2));
        assertArrayEquals(new float[]{0.0f, 1.0f}, reject1);
        assertArrayEquals(new float[]{0.0f, 1.0f}, reject2);

        assertTrue(subject.method1(0.0f, 0.0f, new float[]{0.0f, 1.0f}));
        assertTrue(subject.method2(0.0f, 0.0f, new float[]{0.0f, 1.0f}));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(1.0f, 1.0f, null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(1.0f, 1.0f, null));
    }
}
