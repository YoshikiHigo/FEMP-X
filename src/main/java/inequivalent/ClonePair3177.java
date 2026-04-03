package inequivalent;

public class ClonePair3177 {

    String method1(String in, String delim, boolean returnDelims) {
        int nIndex = in.indexOf(delim);
        if (nIndex != -1 && nIndex < in.length()) {
            if (returnDelims) return in.substring(nIndex);
            else return in.substring(nIndex + delim.length());
        } else {
            return in;
        }
    }

    String method2(String in, String delim, boolean returnDelims) {
        int nIndex = in.lastIndexOf(delim);
        if (nIndex != -1 && nIndex < in.length()) {
            if (returnDelims) return in.substring(nIndex);
            else return in.substring(nIndex + delim.length());
        } else {
            return in;
        }
    }
}
