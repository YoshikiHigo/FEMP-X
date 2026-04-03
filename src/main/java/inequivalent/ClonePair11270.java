package inequivalent;

public class ClonePair11270 {

    String method1(String orig, String compare) {
        if (orig.equals("")) {
            return compare;
        }
        if (!compare.equals(orig.substring(0, compare.length()))) {
            return compare + orig;
        } else {
            return orig;
        }
    }

    String method2(String orig, String compare) {
        if (orig.equals("")) {
            return compare;
        }
        if (!compare.equalsIgnoreCase(orig.substring(0, compare.length()))) {
            return compare + orig;
        } else {
            return orig;
        }
    }
}
