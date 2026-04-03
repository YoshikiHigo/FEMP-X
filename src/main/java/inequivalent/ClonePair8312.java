package inequivalent;

public class ClonePair8312 {

    boolean method1(CharSequence s) {
        if (s == null) return false;
        else {
            int ls = s.length();
            if ((ls == 0) || !Character.isUnicodeIdentifierStart(s.charAt(0))) return false;
            else {
                for (int i = 1; i < ls; i++) {
                    if (!Character.isUnicodeIdentifierPart(s.charAt(i))) return false;
                }
                return true;
            }
        }
    }

    boolean method2(CharSequence s) {
        if (s == null) return false;
        else {
            int ls = s.length();
            if ((ls == 0) || !Character.isJavaIdentifierStart(s.charAt(0))) return false;
            else {
                for (int i = 1; i < ls; i++) {
                    if (!Character.isJavaIdentifierPart(s.charAt(i))) return false;
                }
                return true;
            }
        }
    }
}
