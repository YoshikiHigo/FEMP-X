package equivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair743NoDifferenceTest {

    private final ClonePair743 subject = new ClonePair743();

    @Test
    void noDifferenceFoundForRepresentativeReturnValues() {
        String missingKey = "clonepair743.missing";
        String validKey = "clonepair743.valid";
        String invalidKey = "clonepair743.invalid";

        String originalValid = System.getProperty(validKey);
        String originalInvalid = System.getProperty(invalidKey);
        String originalMissing = System.getProperty(missingKey);
        try {
            clearProperty(missingKey);
            System.setProperty(validKey, "42");
            System.setProperty(invalidKey, "not-a-long");

            assertEquals(7L, subject.method1(missingKey, 7L));
            assertEquals(7L, subject.method2(missingKey, 7L));

            assertEquals(42L, subject.method1(validKey, 7L));
            assertEquals(42L, subject.method2(validKey, 7L));

            assertEquals(7L, subject.method1(invalidKey, 7L));
            assertEquals(7L, subject.method2(invalidKey, 7L));
        } finally {
            restoreProperty(validKey, originalValid);
            restoreProperty(invalidKey, originalInvalid);
            restoreProperty(missingKey, originalMissing);
        }
    }

    private static void clearProperty(String key) {
        System.clearProperty(key);
    }

    private static void restoreProperty(String key, String value) {
        if (value == null) {
            System.clearProperty(key);
        } else {
            System.setProperty(key, value);
        }
    }
}
