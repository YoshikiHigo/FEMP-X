package inequivalent;

public class ClonePair5572 {

    boolean method1(String val, boolean dfault) {
        try {
            if (val == null) {
                return dfault;
            }
            String s = val.trim().toLowerCase();
            if (s.length() == 0) {
                return dfault;
            }
            return (s.equals("true") || s.equals("yes") || s.equals("T") || s.equals("Y"));
        } catch (Exception e) {
            return dfault;
        }
    }

    boolean method2(String name, boolean emptyDefault) {
        if (name == null || name.length() == 0) {
            return emptyDefault;
        }
        if (name.startsWith("__") && name.length() > 2) {
            return Character.isLowerCase(name.charAt(2));
        }
        if (name.startsWith("_") && name.length() > 1) {
            return Character.isLowerCase(name.charAt(1));
        }
        return Character.isLowerCase(name.charAt(0));
    }
}
