package equivalent;

public class ClonePair8026 {
    boolean method1(Object[] oldRow, Object[] newRow, int[] indexColumns) {
        for (int c : indexColumns) {
            Object o = oldRow[c], n = newRow[c];
            if (o == null && n == null) continue;
            if (o == null || n == null) return true;
            if (!o.equals(n)) return true;
        }
        return false;
    }

    boolean method2(Object[] oldRow, Object[] newRow, int[] indexColumns) {
        for (int c : indexColumns) {
            Object o = oldRow[c], n = newRow[c];
            if (o == null) {
                if (n != null) {
                    return true;
                }
            } else if (!o.equals(n)) {
                return true;
            }
        }
        return false;
    }
}
