package equivalent;

public class ClonePair3023 {
    boolean method1(byte[] array1, byte[] array2) {
        boolean same = true;
        int len1 = array1.length;
        if (len1 == array2.length) {
            int i = 0;
            while (i < len1 && same) {
                same = (array1[i] == array2[i]);
                i++;
            }
        } else {
            same = false;
        }
        return same;
    }

    boolean method2(byte[] arr1, byte[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
