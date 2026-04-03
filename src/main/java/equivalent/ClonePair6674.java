package equivalent;

public class ClonePair6674 {
    boolean method1(String name, String firstName) {
        if ((name == null) || (firstName == null)) {
            return false;
        }
        return !name.trim().equals("") || !firstName.trim().equals("");
    }

    boolean method2(String name, String firstName) {
        if (name == null || firstName == null) {
            return false;
        }
        return !name.trim().equals("") || !firstName.trim().equals("");
    }
}
