package equivalent;

public class ClonePair523 {
    boolean method1(byte[] arr1, byte[] arr2) {
        if (arr1 == null || arr2 == null) return arr1 == arr2;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    boolean method2(byte[] test, byte[] good) {
        if ((test == null) || (good == null)) {
            return (test == null) && (good == null);
        }
        if (test.length != good.length) {
            return false;
        }
        if (test.length == 0) {
            return true;
        }
        int bits = 0;
        for (int i = 0; i < good.length; i++) {
            bits |= test[i] ^ good[i];
        }
        return bits == 0;
    }
}
