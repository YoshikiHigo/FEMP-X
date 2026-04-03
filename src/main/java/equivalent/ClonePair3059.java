package equivalent;

import java.util.StringTokenizer;
import java.util.Vector;

public class ClonePair3059 {
    String[] method1(String string, String delimiters) {
        if (string != null && string.length() > 0) {
            StringTokenizer tokenizer = new StringTokenizer(string, delimiters);
            String[] result = new String[tokenizer.countTokens()];
            int i = 0;
            while (tokenizer.hasMoreTokens()) {
                result[i] = tokenizer.nextToken();
                i++;
            }
            return result;
        } else {
            return null;
        }
    }

    String[] method2(String s, String seperator) {
        if (s == null || s.equals("")) return null;
        StringTokenizer st = new StringTokenizer(s, seperator);
        Vector vec = new Vector();
        while (st.hasMoreTokens()) {
            vec.addElement(st.nextToken());
        }
        String[] array = new String[vec.size()];
        vec.copyInto(array);
        return array;
    }
}
