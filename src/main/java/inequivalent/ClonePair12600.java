package inequivalent;

public class ClonePair12600 {

    boolean method1(String title, String[] includes) {
        if (includes == null || includes.length < 1) return true;
        for (int i = 0; i < includes.length; i++) if (title.equalsIgnoreCase(includes[i])) return true;
        return false;
    }

    boolean method2(String columnName, String[] columnNames) {
        boolean b = false;
        if (columnNames == null || columnNames.length < 1) {
            return true;
        }
        for (String colName : columnNames) {
            if (columnName.trim().equalsIgnoreCase(colName)) {
                return true;
            }
        }
        return b;
    }
}
