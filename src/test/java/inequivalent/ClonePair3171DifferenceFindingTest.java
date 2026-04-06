package inequivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3171DifferenceFindingTest {

    private final ClonePair3171 subject = new ClonePair3171();

    @Test
    void methodsRecognizeDifferentCodeSystems() {
        String namespace = "http://www.imsglobal.org/xsd/imsmd_v1p2";

        assertEquals("imsmd", subject.method1(namespace, "fallback", false));
        assertEquals("fallback", subject.method2(namespace, "fallback", false));
    }
}
