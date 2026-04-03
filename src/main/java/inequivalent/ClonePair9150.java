package inequivalent;

public class ClonePair9150 {

    String method1(String msg, String header, String shortHdr) {
        int posHdr = 0;
        int posEnd = 0;
        String tmpStr;
        posHdr = msg.indexOf(header + ": ");
        if (posHdr == -1) {
            if (shortHdr == null) {
                return null;
            } else {
                posHdr = msg.indexOf(shortHdr + ": ");
                if (posHdr == -1) {
                    return null;
                }
            }
        }
        posEnd = msg.indexOf("\r\n", posHdr);
        tmpStr = msg.substring(posHdr, posEnd) + "\r\n";
        return tmpStr;
    }

    String method2(String msg, String header, String shortHdr) {
        int posStart = 0;
        int posEnd = 0;
        int len = 0;
        String tmpStr;
        posStart = msg.indexOf(header + ": ");
        if (posStart == -1) {
            if (shortHdr == null) {
                return null;
            } else {
                posStart = msg.indexOf(shortHdr + ": ");
                if (posStart == -1) {
                    return null;
                }
            }
        } else {
            len = header.length() + 2;
        }
        if (posStart == -1) {
            return null;
        }
        posEnd = msg.indexOf("\r\n", posStart + len);
        tmpStr = msg.substring(posStart + len, posEnd) + "\r\n";
        tmpStr = tmpStr.trim();
        return tmpStr;
    }
}
