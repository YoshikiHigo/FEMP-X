package equivalent;

import org.junit.jupiter.api.Test;

import static equivalent.ClonePairGenericInvocationTestSupport.*;

class ClonePair7273NoDifferenceTest {

    private final ClonePair7273 subject = new ClonePair7273();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        Object[] caseInputs0 = new Object[]{ClassLoader.getSystemClassLoader(), ClassLoader.getSystemClassLoader()};
        assertEquivalent(
            capture(values -> subject.method1((ClassLoader) values[0], (ClassLoader) values[1]), caseInputs0),
            capture(values -> subject.method2((ClassLoader) values[0], (ClassLoader) values[1]), caseInputs0)
        );
        Object[] caseInputs1 = new Object[]{new java.net.URLClassLoader(new java.net.URL[0], null), ClassLoader.getSystemClassLoader()};
        assertEquivalent(
            capture(values -> subject.method1((ClassLoader) values[0], (ClassLoader) values[1]), caseInputs1),
            capture(values -> subject.method2((ClassLoader) values[0], (ClassLoader) values[1]), caseInputs1)
        );
    }
}
