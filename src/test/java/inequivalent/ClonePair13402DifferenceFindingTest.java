package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair13402DifferenceFindingTest {

    private final ClonePair13402 subject = new ClonePair13402();

    @Test
    void methodsReturnDifferentValuesWhenBytesAppearInDifferentOrder() {
        assertFalse(subject.method1(new byte[]{0, 1}, new byte[]{1, 0}));
        assertTrue(subject.method2(new byte[]{0, 1}, new byte[]{1, 0}));
    }
}
