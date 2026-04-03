package inequivalent;

public class ClonePair5884 {

    boolean method1(String str1, String str2) {
        boolean match = false;
        if (str1 == null && str2 == null) {
            match = true;
        } else if (str1 == null || str2 == null) {
            match = false;
        } else if (str1.equals(str2)) {
            match = true;
        }
        return match;
    }

    boolean method2(String l, String r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        try {
            double ll = Double.parseDouble(l);
            double rr = Double.parseDouble(r);
            return (ll == rr);
        } catch (NumberFormatException nfe) {
        }
        return l.equals(r);
    }
}
