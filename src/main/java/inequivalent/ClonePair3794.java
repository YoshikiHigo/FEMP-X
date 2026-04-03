package inequivalent;

import java.util.StringTokenizer;

public class ClonePair3794 {

    boolean method1(String style, String aStyleProperty) {
        if (style == null || aStyleProperty == null) {
            return false;
        }
        String lowerStyle = style.toLowerCase();
        String lowerProperty = aStyleProperty.toLowerCase();
        if (lowerStyle.indexOf(lowerProperty) < 0) {
            return false;
        }
        StringTokenizer st = new StringTokenizer(lowerStyle, ";");
        while (st.hasMoreTokens()) {
            if (st.nextToken().trim().startsWith(lowerProperty)) {
                return true;
            }
        }
        return false;
    }

    boolean method2(String target1, String target2) {
        if (target1 == null || target2 == null) {
            return false;
        }
        final int length1 = target1.length();
        final int length2 = target2.length();
        if (length1 < length2) {
            return false;
        }
        final String s1 = target1.substring(0, target2.length());
        return s1.equalsIgnoreCase(target2);
    }
}
