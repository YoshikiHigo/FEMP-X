package equivalent;

public class ClonePair6186 {
    boolean method1(String oldString, String newString) {
        if (oldString == null && newString == null) {
            return false;
        } else if (oldString == null || newString == null) {
            return true;
        } else {
            return !oldString.equals(newString);
        }
    }

    boolean method2(String a, String b) {
        if (a == null && b == null) return false;
        if (a == null) return true;
        if (b == null) return true;
        return (a.compareTo(b) != 0);
    }
}
