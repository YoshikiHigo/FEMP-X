package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair3932DifferenceFindingTest {

    private final ClonePair3932 subject = new ClonePair3932();

    @Test
    void methodsParseDifferentPropertySyntaxes() {
        Properties method1 = subject.method1("A:B");
        Properties method2 = subject.method2("A:B");

        assertEquals("B", method1.getProperty("a"));
        assertEquals(null, method2.getProperty("A"));
    }
}
