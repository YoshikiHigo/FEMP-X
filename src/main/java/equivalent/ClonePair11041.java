package equivalent;

public class ClonePair11041 {
    boolean method1(String[] columns, String columnName) {
        if (columnName == null) {
            return false;
        }
        if (columns == null) {
            return false;
        }
        for (String c : columns) {
            if (columnName.equals(c)) {
                return true;
            }
        }
        return false;
    }

    boolean method2(String[] values, String key) {
        if (values == null || values.length <= 0 || key == null) return false;
        for (int i = 0; i < values.length; i++) if (key.equals(values[i])) return true;
        return false;
    }
}
