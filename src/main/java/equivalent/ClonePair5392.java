package equivalent;

public class ClonePair5392 {
    boolean method1(String oldString, String newString) {
        if (oldString == null && newString == null) {
            return false;
        } else if ((oldString == null && newString != null) || (oldString != null && newString == null)) {
            return true;
        } else {
            return !oldString.equals(newString);
        }
    }

    boolean method2(String r, String c) {
        if (r == null && c == null) {
            return false;
        }
        if (r != null && c != null) {
            return !r.equals(c);
        }
        return true;
    }
}
