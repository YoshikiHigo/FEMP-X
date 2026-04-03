package inequivalent;

public class ClonePair9151 {

    boolean method1(String val, String end) {
        int i = val.length() - 1;
        for (int iEnd = end.length() - 1; iEnd >= 0; i--, iEnd--) {
            if (val.charAt(i) != end.charAt(iEnd)) return false;
        }
        return true;
    }

    boolean method2(String str, String subStr) {
        for (int i = 0; i < subStr.length(); i++) {
            if (subStr.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
