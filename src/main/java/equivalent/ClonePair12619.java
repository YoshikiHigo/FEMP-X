package equivalent;

public class ClonePair12619 {
    boolean method1(String str, String[] strArr) {
        boolean found = false;
        if (str != null && !str.equals("")) {
            for (String element : strArr) {
                if (str.equalsIgnoreCase(element)) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    boolean method2(String s, String[] a) {
        if (s == null || s.length() == 0) return false;
        for (String mem : a) {
            if (s.equalsIgnoreCase(mem)) return true;
        }
        return false;
    }
}
