package equivalent;

public class ClonePair10125 {
    boolean method1(Object[] list, Object value) {
        boolean result = false;
        if ((list != null) && (value != null)) {
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals(value)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    boolean method2(Object[] a, Object o) {
        if (a == null || o == null) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(o)) return true;
        }
        return false;
    }
}
