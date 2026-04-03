package inequivalent;

public class ClonePair11046 {

    boolean method1(String[] interfaces, String intf) {
        if (interfaces == null || interfaces.length <= 0) {
            return false;
        }
        for (int i = 0; i < interfaces.length; i++) {
            if (interfaces[i].equals(intf)) {
                return true;
            }
        }
        return false;
    }

    boolean method2(String[] items, String newText) {
        if (items == null) return false;
        for (String s : items) if (s.equalsIgnoreCase(newText)) return true;
        return false;
    }
}
