package equivalent;

public class ClonePair1295 {
    String method1(byte[] ucsbytes) {
        char[] c = new char[ucsbytes.length / 2];
        for (int i = 0; i < ucsbytes.length; i += 2) {
            c[i / 2] = (char) ((ucsbytes[i] << 8) + (ucsbytes[i + 1] & 0xFF));
        }
        return new String(c);
    }

    String method2(byte[] in) {
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < in.length; ) {
            byte hi = in[i++];
            byte lo = in[i++];
            char c = (char) (hi * 256 + lo + (lo < 0 ? 256 : 0));
            b.append(c);
        }
        return b.toString();
    }
}
