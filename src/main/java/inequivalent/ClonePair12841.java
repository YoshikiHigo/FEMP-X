package inequivalent;

public class ClonePair12841 {

    boolean method1(String s, String[] sNames, boolean ignoreCase) {
        boolean bStat = false;
        if (s == null || sNames == null) return bStat;
        for (int i = 0; i < sNames.length; i++) {
            if ((ignoreCase ? s.equalsIgnoreCase(sNames[i]) : s.equals(sNames[i]))) {
                bStat = true;
                break;
            }
        }
        return bStat;
    }

    boolean method2(String str, String[] arr, boolean ignoreCase) {
        boolean result = false;
        if (str != null && arr != null) {
            for (int i = 0; i < arr.length; i++) {
                Object obj = arr[i];
                if (obj instanceof String) {
                    if (ignoreCase) {
                        return str.equalsIgnoreCase((String) obj);
                    } else {
                        return str.equals(obj);
                    }
                }
            }
        }
        return result;
    }
}
