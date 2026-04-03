package inequivalent;

public class ClonePair8902 {

    boolean method1(String port, String portlist) {
        if (portlist.length() == 0) return true;
        int match = portlist.indexOf(port);
        while (match != -1) {
            boolean isMatch = true;
            if (match > 0) {
                char c = portlist.charAt(match - 1);
                if (c >= '0' && c <= '9') isMatch = false;
            }
            if (match + port.length() < portlist.length()) {
                char c = portlist.charAt(match + port.length());
                if (c >= '0' && c <= '9') isMatch = false;
            }
            if (isMatch) return true;
            match = portlist.indexOf(port, match + 1);
        }
        return false;
    }

    boolean method2(String argChar, String argStr) {
        boolean blnReturnValue = (argStr.indexOf(argChar) >= 0) && (argStr.indexOf(argChar) <= argStr.length());
        return blnReturnValue;
    }
}
