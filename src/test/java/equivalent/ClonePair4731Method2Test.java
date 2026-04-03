package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClonePair4731Method2Test {

    private final ClonePair4731 subject = new ClonePair4731();

    @Test
    void method2ReturnsRequestedNumberOfWordsUsingAlphabetCharacters() {
        String[] alphabet = {"A", "B", "C"};

        String[] words = subject.method2(alphabet, 4, 6);

        assertEquals(6, words.length);
        for (String word : words) {
            assertEquals(4, word.length());
            for (char c : word.toCharArray()) {
                assertTrue(c == 'A' || c == 'B' || c == 'C');
            }
        }
    }

    @Test
    void method2ReturnsEmptyArrayWhenNumberOfWordsIsZero() {
        assertArrayEquals(new String[0], subject.method2(new String[]{"A", "B"}, 3, 0));
    }

    @Test
    void method2ReturnsEmptyStringsWhenLengthOfWordIsZero() {
        assertArrayEquals(new String[]{"", "", ""}, subject.method2(new String[]{"A", "B"}, 0, 3));
    }

    @Test
    void method2ThrowsWhenAlphabetIsNull() {
        assertThrows(NullPointerException.class, () -> subject.method2(null, 2, 1));
    }

    @Test
    void method2ThrowsWhenAlphabetIsEmptyAndCharactersAreRequested() {
        assertThrows(IllegalArgumentException.class, () -> subject.method2(new String[0], 1, 1));
    }
}
