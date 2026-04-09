package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1921NoDifferenceTest {

    private final ClonePair1921 subject = new ClonePair1921();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] bytes = {31, 32, 65, 126, 127, (byte) 0xff};
        assertEquals(". A~..", subject.method1(bytes));
        assertEquals(". A~..", subject.method2(bytes));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null));
    }
}
