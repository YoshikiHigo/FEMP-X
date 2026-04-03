package inequivalent;

public class ClonePair6539 {

    boolean method1(String current, String active) {
        int v1 = 0, v2 = 0;
        boolean bool = false;
        if (active == null) {
            active = "";
        }
        try {
            v1 = Integer.parseInt(current);
            v2 = Integer.parseInt(active);
            bool = v1 == v2;
        } catch (NumberFormatException ex) {
            bool = current.trim().equals(active.trim());
        }
        return bool;
    }

    boolean method2(String i1, String i2) {
        return i1.length() == 0 || i1.equals("none") || i1.equals(i2);
    }
}
