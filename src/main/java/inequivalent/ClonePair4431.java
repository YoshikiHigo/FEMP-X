package inequivalent;

public class ClonePair4431 {

    boolean method1(String s1, String s2) {
        if (s1 == null) return ((s2 == null) || s2.equals(""));
        if (s2 == null) return (s1.equals(""));
        return (s1.equalsIgnoreCase(s2));
    }

    boolean method2(String s1, String s2) {
        if (s1 == null) return s2 == null || s2.equals("");
        if (s2 == null) return s1.equals("");
        return s1.equals(s2);
    }
}
