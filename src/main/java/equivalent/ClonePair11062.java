package equivalent;

public class ClonePair11062 {
    boolean method1(String[] a, String val) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) {
                if (val == null) {
                    return true;
                }
            } else {
                if (a[i].equals(val)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean method2(String[] aliases, String url) {
        if (url == null) {
            for (int i = 0; i < aliases.length; i++) {
                if (aliases[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < aliases.length; i++) {
                if (url.equals(aliases[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
