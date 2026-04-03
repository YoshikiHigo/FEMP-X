package inequivalent;

public class ClonePair6009 {

    boolean method1(String prefix, String string) {
        if (prefix == null || string == null || prefix.length() > string.length()) return false;
        String start = string.substring(0, prefix.length());
        return start.equalsIgnoreCase(prefix);
    }

    boolean method2(String extName, String extString) {
        if (extName == null || extString == null) {
            return (false);
        }
        return (extString.indexOf(extName + " ") >= 0) || extString.endsWith(extName) || extString.equals(extName);
    }
}
