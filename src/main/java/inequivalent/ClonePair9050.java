package inequivalent;

public class ClonePair9050 {

    boolean method1(char[] ca, int start, int end, char... test) {
        if (test.length != (end - start + 1)) {
            return false;
        }
        for (int i = start, j = 0; i < end && j < test.length; i++, j++) {
            if (ca[i] != test[j]) {
                return false;
            }
        }
        return true;
    }

    boolean method2(char[] ca, int start, int end, char... test) {
        if (test.length != (end - start + 1)) {
            return false;
        }
        for (int i = start, j = 0; i < end && j < test.length; i++, j++) {
            if (Character.toLowerCase(ca[i]) != Character.toLowerCase(test[j])) {
                return false;
            }
        }
        return true;
    }
}
