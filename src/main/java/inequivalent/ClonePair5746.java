package inequivalent;

public class ClonePair5746 {

    boolean method1(String v, boolean defVal) {
        if ((null == v) || (v.length() <= 0)) return defVal;
        return "yes".equalsIgnoreCase(v) || "true".equalsIgnoreCase(v);
    }

    boolean method2(String s, boolean defaultValue) {
        if (s != null) {
            String s2 = s.trim();
            if (s2.equalsIgnoreCase("true") || s2.equalsIgnoreCase("yes")) return true;
            if (s2.equalsIgnoreCase("false") || s2.equalsIgnoreCase("no")) return false;
        }
        return defaultValue;
    }
}
