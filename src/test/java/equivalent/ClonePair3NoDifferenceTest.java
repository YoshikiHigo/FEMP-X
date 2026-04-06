package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairDifferenceTestSupport.assertThrowsByName;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3NoDifferenceTest {

    private final ClonePair3 subject = new ClonePair3();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        String[] matchingArgs = {"--port", "8080", "--host", "localhost"};
        String[] originalMatchingArgs = matchingArgs.clone();

        assertEquals("8080", subject.method1(matchingArgs, "--port", "default"));
        assertArrayEquals(originalMatchingArgs, matchingArgs);
        assertEquals("8080", subject.method2(matchingArgs, "--port", "default"));
        assertArrayEquals(originalMatchingArgs, matchingArgs);

        String[] missingArgs = {"--host", "localhost"};
        String[] originalMissingArgs = missingArgs.clone();

        assertEquals("default", subject.method1(missingArgs, "--port", "default"));
        assertArrayEquals(originalMissingArgs, missingArgs);
        assertEquals("default", subject.method2(missingArgs, "--port", "default"));
        assertArrayEquals(originalMissingArgs, missingArgs);
    }

    @Test
    void noDifferenceFoundForRepresentativeExceptionOutcomes() {
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(null, "--port", "default"));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(null, "--port", "default"));

        String[] nullArrayElement = {null};
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method1(nullArrayElement, "--port", "default"));
        assertThrowsByName("java.lang.NullPointerException", () -> subject.method2(nullArrayElement, "--port", "default"));

        String[] missingValueAfterMatch = {"--port"};
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method1(missingValueAfterMatch, "--port", "default"));
        assertThrowsByName("java.lang.ArrayIndexOutOfBoundsException", () -> subject.method2(missingValueAfterMatch, "--port", "default"));
    }
}
