package equivalent;

public class ClonePair6237 {
    boolean method1(boolean[] a, boolean[] a2) {
        if (a == a2) return true;
        if (a == null || a2 == null) return false;
        int length = a.length;
        if (a2.length != length) return false;
        for (int i = 0; i < length; i++) if (a[i] != a2[i]) return false;
        return true;
    }

    boolean method2(boolean[] arrayOne, boolean[] arrayTwo) {
        boolean result = true;
        if ((arrayOne != null && arrayTwo == null) || (arrayOne == null && arrayTwo != null)) {
            result = false;
        } else if (arrayOne != null) {
            if (arrayOne.length != arrayTwo.length) {
                result = false;
            } else {
                for (int i = 0; i < arrayOne.length; i++) {
                    if (arrayOne[i] != arrayTwo[i]) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
