package inequivalent;

import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClonePair6806DifferenceFindingTest {
    @Test
    void methodsGenerateFieldAndMethodDeclarationsDifferently() {
        ClonePair6806 clonePair = new ClonePair6806();
        Vector<String> types = new Vector<>();
        types.add("int");
        Vector<String> names = new Vector<>();
        names.add("x");

        assertEquals("  public int x;\r\n\r\n\r\n", clonePair.method1(types, names));
        assertEquals("  public int x()\r\n  {\r\n  }\r\n\r\n", clonePair.method2(types, names));
    }
}
