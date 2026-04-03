package equivalent;

public class ClonePair8861 {
    boolean method1(String one, String two) {
        if (one == null && two == null) {
            return true;
        }
        if (one == null || two == null) {
            return false;
        }
        return one.compareTo(two) == 0;
    }

    boolean method2(String stringA, String stringB) {
        if (stringA == null) {
            return stringB == null;
        }
        if (stringB == null) return false;
        return stringA.compareTo(stringB) == 0;
    }
}
