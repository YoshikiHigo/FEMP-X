package inequivalent;

public class ClonePair3687 {

    boolean method1(String s1, String s2) {
        if (s1 == null && s2 == null) return true;
        if ((s1 == null || s2 == null)) return false;
        return s1.equals(s2);
    }

    boolean method2(String strA, String strB) {
        if ((strA == null) && (strB == null)) {
            return true;
        }
        if ((strA == null) || (strB == null)) {
            return false;
        }
        return (strA.compareToIgnoreCase(strB) == 0);
    }
}
