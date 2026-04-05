package all;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair73DifferenceTest {

    private final ClonePair73 subject = new ClonePair73();

    @Test
    void methodsDivergeOnCurlyOpeningQuoteWithoutClosingQuote() {
        String query = "\u201C ";

        assertEquals(List.of("\u201C "), subject.method1(query));
        assertEquals(List.of("\u201C"), subject.method2(query));
    }
}
