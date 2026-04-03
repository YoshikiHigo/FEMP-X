package inequivalent;

public class ClonePair4285 {

    boolean method1(String readA, String readB) {
        if ((readA.trim().length() <= 0) || (readB.trim().length() <= 0)) return false;
        String strA = readA.substring(0, readA.length() - 1);
        String strB = readB.substring(0, readB.length() - 1);
        return strA.equals(strB);
    }

    boolean method2(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 == 0 || l2 == 0 || l1 < l2) return false;
        return s1.regionMatches(l1 - l2, s2, 0, l2);
    }
}
