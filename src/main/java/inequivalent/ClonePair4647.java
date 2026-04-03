package inequivalent;

public class ClonePair4647 {

    boolean method1(String string1, String string2) {
        if (string1 == null && string2 == null) {
            return true;
        }
        if (string1 == null || string2 == null) {
            return false;
        }
        return (string1).equalsIgnoreCase(string2);
    }

    boolean method2(String a, String b) {
        if (a == null && b == null) return true;
        if (a == null) return false;
        if (b == null) return false;
        return a.compareTo(b) == 0;
    }
}
