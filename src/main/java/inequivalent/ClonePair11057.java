package inequivalent;

public class ClonePair11057 {

    boolean method1(String[] list, String value) {
        if (list == null || list.length == 0) return false;
        boolean found = false;
        for (int i = 0, len = list.length; i < len && !found; i++) {
            found = list[i].equals(value);
        }
        return found;
    }

    boolean method2(String[] strs, String str) {
        if ((str == null) || (strs == null)) return false;
        for (int s = 0; s < strs.length; s++) if (strs[s].equalsIgnoreCase(str)) return true;
        return false;
    }
}
