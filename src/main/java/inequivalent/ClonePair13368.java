package inequivalent;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ClonePair13368 {

    String[] method1(String property) {
        final String delimiter = " ";
        Vector classes = new Vector();
        while (property.length() > 0) {
            int i = property.indexOf(delimiter);
            if (i > 0) {
                classes.addElement(property.substring(0, i));
                property = property.substring(property.indexOf(delimiter) + 1);
            } else {
                classes.addElement(property);
                property = "";
            }
        }
        String[] result = new String[classes.size()];
        for (int i = 0; i < classes.size(); i++) {
            result[i] = (String) classes.elementAt(i);
            System.out.println("result " + i + ": " + result[i]);
        }
        return result;
    }

    String[] method2(String args) {
        if (args.length() == 0) return new String[0];
        List<String> result = new ArrayList<String>();
        StringBuilder token = new StringBuilder();
        int depth = 0;
        for (int i = 0; i < args.length(); i++) {
            char c = args.charAt(i);
            switch (c) {
                case '(':
                    depth++;
                    token.append(c);
                    break;
                case ')':
                    depth--;
                    token.append(c);
                    break;
                case ',':
                    if (depth == 0) {
                        result.add(token.toString().trim());
                        token.setLength(0);
                        break;
                    }
                default:
                    token.append(c);
            }
        }
        result.add(token.toString().trim());
        return result.toArray(new String[result.size()]);
    }
}
