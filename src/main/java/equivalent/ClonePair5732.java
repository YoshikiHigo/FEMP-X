package equivalent;

public class ClonePair5732 {
    boolean method1(String s1, String s2, boolean ignoreCase) {
        if (s1 == null) {
            return (s2 == null);
        } else if (s2 == null) {
            return false;
        } else {
            return (ignoreCase) ? s1.equalsIgnoreCase(s2) : s1.equals(s2);
        }
    }

    boolean method2(String str1, String str2, boolean ignoreCase) {
        if (str1 == null) {
            return (str2 == null);
        }
        if (str2 == null) {
            return false;
        }
        if (ignoreCase) {
            return str1.equalsIgnoreCase(str2);
        } else {
            return str1.equals(str2);
        }
    }
}
