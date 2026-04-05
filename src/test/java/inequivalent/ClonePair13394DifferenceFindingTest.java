package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ClonePair13394DifferenceFindingTest {

    private final ClonePair13394 subject = new ClonePair13394();

    @Test
    void methodsTreatPortSuffixDifferently() {
        assertArrayEquals(new byte[]{1, 2, 3, 4}, subject.method1("1.2.3.4:80"));
        assertNull(subject.method2("1.2.3.4:80"));
    }
}
