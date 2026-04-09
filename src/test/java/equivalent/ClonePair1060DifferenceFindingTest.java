package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1060DifferenceFindingTest {

    private final ClonePair1060 subject = new ClonePair1060();

    @Test
    void methodsTreatReferenceEqualityDifferently() {
        NonReflexiveValue value = new NonReflexiveValue();
        Object[] array = {value};

        assertEquals(0, subject.method1(array, value));
        assertEquals(-1, subject.method2(array, value));
    }

    private static final class NonReflexiveValue {
        @Override
        public boolean equals(Object other) {
            return false;
        }
    }
}
