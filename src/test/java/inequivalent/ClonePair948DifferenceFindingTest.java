package inequivalent;

import org.junit.jupiter.api.Test;

import static inequivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair948DifferenceFindingTest {

    private final ClonePair948 subject = new ClonePair948();

    @Test
    void methodsRequireDifferentMinimumArrayLengths() {
        assertTrue(subject.method1(new byte[]{1, 2, 3, 4}, new byte[]{1, 2, 3, 4}));
        assertThrowsByName(
                "java.lang.ArrayIndexOutOfBoundsException",
                () -> subject.method2(new byte[]{1, 2, 3, 4}, new byte[]{1, 2, 3, 4})
        );
    }
}
