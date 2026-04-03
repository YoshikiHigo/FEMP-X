package equivalent;

import java.util.StringTokenizer;
import java.util.Vector;

public class ClonePair7892 {
    String[] method1(String str, String delimiter, boolean trim) {
        if (str == null) {
            return null;
        }
        StringTokenizer st = new StringTokenizer(str, delimiter);
        int count = st.countTokens();
        if (count == 0) {
            return new String[0];
        }
        String[] bolck = new String[count];
        for (int i = 0; i < count; i++) {
            bolck[i] = st.nextToken();
        }
        if (trim) {
            for (int i = 0; i < count; i++) {
                bolck[i] = bolck[i].trim();
            }
        }
        return bolck;
    }

    String[] method2(String string, String tokens, boolean trimStrings) {
        if (string == null) return (null);
        if (string.length() == 0) return (new String[0]);
        Vector res = new Vector();
        StringTokenizer stk = new StringTokenizer(string, tokens, false);
        while (stk.hasMoreTokens()) res.addElement(stk.nextToken());
        String[] res2 = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            res2[i] = (String) res.elementAt(i);
            if (trimStrings) res2[i] = res2[i].trim();
        }
        return (res2);
    }
}
