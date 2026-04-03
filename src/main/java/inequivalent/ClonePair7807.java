package inequivalent;

public class ClonePair7807 {

    boolean method1(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.equals(b)) return true;
        if (a.length() == 0 && b.length() > 0) return false;
        if (b.length() == 0) return true;
        return (!(a.charAt(0) == '.') && b.charAt(0) == '.' && a.endsWith(b));
    }

    boolean method2(String str, String op) {
        if (str.length() >= op.length()) {
            for (int i = 0; i <= str.length() - op.length(); i++) {
                if (i == (str.length() - op.length())) {
                    if (str.substring(i).equals(op)) return true;
                } else if (str.startsWith(op, i)) return true;
            }
        }
        return false;
    }
}
