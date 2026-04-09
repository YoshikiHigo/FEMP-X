package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair1509NoDifferenceTest {

    private final ClonePair1509 subject = new ClonePair1509();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        byte[] data = {(byte) 0b10110010, (byte) 0b01000000};
        assertEquals((byte) 0b101, subject.method1(data, 0, 3));
        assertEquals((byte) 0b101, subject.method2(data, 0, 3));

        assertEquals((byte) 0b100100, subject.method1(data, 3, 6));
        assertEquals((byte) 0b100100, subject.method2(data, 3, 6));
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(new byte[]{0}, 8, 1));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(new byte[]{0}, 8, 1));
    }
}
