package unverified;

import org.junit.jupiter.api.Test;

import java.net.URL;
import java.net.URLClassLoader;

import static unverified.ClonePairGenericInvocationTestSupport.*;

class ClonePair7275NoDifferenceTest {

    private final ClonePair7275 subject = new ClonePair7275();

    // No separating input was found; these tests document representative equivalent paths.
    @Test
    void noDifferenceFoundForRepresentativeInputs() {
        ClassLoader system = ClassLoader.getSystemClassLoader();
        ClassLoader platform = system.getParent();
        ClassLoader isolated = new URLClassLoader(new URL[0], null);

        assertEquivalent(
            capture(values -> subject.method1((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{null, null}),
            capture(values -> subject.method2((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{null, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{null, system}),
            capture(values -> subject.method2((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{null, system})
        );
        assertEquivalent(
            capture(values -> subject.method1((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{system, null}),
            capture(values -> subject.method2((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{system, null})
        );
        assertEquivalent(
            capture(values -> subject.method1((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{platform, system}),
            capture(values -> subject.method2((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{platform, system})
        );
        assertEquivalent(
            capture(values -> subject.method1((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{isolated, system}),
            capture(values -> subject.method2((ClassLoader) values[0], (ClassLoader) values[1]), new Object[]{isolated, system})
        );
    }
}
