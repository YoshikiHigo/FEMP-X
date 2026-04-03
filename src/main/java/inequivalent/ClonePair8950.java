package inequivalent;

public class ClonePair8950 {

    boolean method1(String string1, String string2) {
        boolean stringsAreEqual = false;
        if (string1.length() == string2.length()) {
            int stringLength = string1.length();
            int pos;
            for (pos = 0; pos < stringLength; ++pos) {
                if (Character.toUpperCase(string1.charAt(pos)) != Character.toUpperCase(string2.charAt(pos))) {
                    break;
                }
            }
            if (pos == stringLength) {
                stringsAreEqual = true;
            }
        }
        return stringsAreEqual;
    }

    boolean method2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Compare failed: lengths differ");
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println("Compare failed: bytes at " + i + " differ [" + s1.charAt(i) + "] [" + s2.charAt(i) + "]");
                return false;
            }
        }
        return true;
    }
}
