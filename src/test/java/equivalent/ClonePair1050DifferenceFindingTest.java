package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1050DifferenceFindingTest {

    private final ClonePair1050 subject = new ClonePair1050();

    @Test
    void methodsTreatNullKeyDifferentlyWhenElementEqualsNull() {
        Object[] values = {new NullFriendlyValue()};

        assertEquals(-1, subject.method1(values, null));
        assertEquals(0, subject.method2(values, null));
    }

    private static final class NullFriendlyValue {
        @Override
        public boolean equals(Object other) {
            return other == null;
        }
    }
}
