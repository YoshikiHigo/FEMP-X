package inequivalent;

public class ClonePair10905 {

    String method1(String xstring, int nrchars, String padstr) {
        while (xstring.length() < nrchars) {
            xstring += padstr;
        }
        if (xstring.length() > nrchars) xstring = xstring.substring(0, nrchars);
        return xstring;
    }

    String method2(String xstring, int nrchars, String padstr) {
        while (xstring.length() < nrchars) {
            xstring = padstr + xstring;
        }
        if (xstring.length() > nrchars) xstring = xstring.substring(0, nrchars);
        return xstring;
    }
}
