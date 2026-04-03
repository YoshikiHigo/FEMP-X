package inequivalent;

import java.util.Vector;

public class ClonePair6806 {

    String method1(Vector<String> fieldTypes, Vector<String> fieldNames) {
        String str = "";
        if (fieldNames.size() != 0 && fieldTypes.size() != 0 && fieldNames.size() == fieldTypes.size()) {
            for (int index = 0; index < fieldNames.size(); index++)
                str += "  public " + fieldTypes.get(index) + " " + fieldNames.get(index) + ";\r\n";
            str += "\r\n\r\n";
        }
        return str;
    }

    String method2(Vector<String> methodTypes, Vector<String> methodNames) {
        String str = "";
        if (methodNames.size() != 0 && methodTypes.size() != 0 && methodNames.size() == methodTypes.size()) {
            for (int index = 0; index < methodNames.size(); index++)
                str += "  public " + methodTypes.get(index) + " " + methodNames.get(index) + "()\r\n  {\r\n  }\r\n\r\n";
        }
        return str;
    }
}
