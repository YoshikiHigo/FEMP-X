package equivalent;

public class ClonePair4803 {
    String method1(String toPad, char padWith, int total) {
        int strLen = toPad.length();
        int numToPad = total - strLen;
        if (numToPad > 0) {
            StringBuffer sb = new StringBuffer(toPad);
            for (int i = 0; i <= numToPad; i++) {
                sb.append(padWith);
            }
            return sb.toString();
        } else {
            return toPad;
        }
    }

    String method2(String s, char c, int l) {
        if (s.length() < l) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < l - s.length(); i++) {
                sb.append(c);
            }
            return s + sb;
        }
        return s;
    }
}
