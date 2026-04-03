package inequivalent;

public class ClonePair4117 {

    boolean method1(String[] expAttrs, String[] realAttrs) {
        if (expAttrs.length != realAttrs.length) {
            return false;
        }
        boolean[] met = new boolean[expAttrs.length];
        for (int i = 0; i < realAttrs.length; i++) {
            for (int j = 0; j < expAttrs.length; j++) {
                if (expAttrs[j].equals(realAttrs[i])) {
                    met[j] = true;
                }
            }
        }
        boolean result = true;
        for (int i = 0; i < met.length && result; i++) {
            result = met[i];
        }
        return result;
    }

    boolean method2(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int ii = 0; ii < arr1.length; ii++) {
                if (!arr1[ii].equals(arr2[ii])) {
                    System.err.println("Not equal: " + arr1[ii] + " and " + arr2[ii]);
                    return false;
                }
            }
            return true;
        }
    }
}
