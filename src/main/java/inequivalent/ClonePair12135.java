package inequivalent;

public class ClonePair12135 {

    boolean method1(String type) {
        if (type == null) {
            return false;
        }
        String str = type.trim().toUpperCase();
        return "CHAR".equals(str) || "VARCHAR".equals(str) || "NVARCHAR".equals(str) || "DECIMAL".equals(str) || "NUMERIC".equals(str);
    }

    boolean method2(String name) {
        if (name == null) return false;
        if (name.length() == 0) return false;
        boolean safeChars = name.matches("[a-zA-Z0-9-_.]*");
        boolean doubleDot = (name.indexOf("..") >= 0);
        boolean hidden = name.startsWith(".");
        boolean root = name.startsWith("/");
        boolean legal = safeChars & !doubleDot & !hidden & !root;
        return legal;
    }
}
