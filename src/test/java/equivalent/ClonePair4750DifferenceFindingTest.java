package equivalent;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClonePair4750DifferenceFindingTest {

    private final ClonePair4750 subject = new ClonePair4750();

    @Test
    void methodsDisagreeOnRecheckedInput() {
        assertEquals("aa", subject.method1("aa", '-', Integer.MIN_VALUE));
        assertThrows(java.lang.OutOfMemoryError.class, () -> subject.method2("aa", '-', Integer.MIN_VALUE));
    }
}
