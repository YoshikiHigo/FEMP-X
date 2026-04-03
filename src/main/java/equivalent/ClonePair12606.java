package equivalent;

public class ClonePair12606 {
    boolean method1(String str, String[] array) {
        if (str == null || array == null) {
            return false;
        }
        for (String a : array) {
            if (a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    boolean method2(String str, String[] strs) {
        if (strs == null || str == null) return false;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str)) return true;
        }
        return false;
    }
}
