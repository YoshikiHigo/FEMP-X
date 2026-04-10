package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair7176DifferenceFindingTest {

    private final ClonePair7176 subject = new ClonePair7176();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertEquals(-2, subject.method1(new byte[]{0, 0, 0, 0}, Integer.MIN_VALUE, -1, new byte[]{0, 0, 0, 0}, Integer.MIN_VALUE, 1));
        assertThrows(java.lang.ArrayIndexOutOfBoundsException.class, () -> subject.method2(new byte[]{0, 0, 0, 0}, Integer.MIN_VALUE, -1, new byte[]{0, 0, 0, 0}, Integer.MIN_VALUE, 1));
    }
}
