package equivalent;

public class ClonePair8067 {
    String method1(byte[] sysex, int ofs, int len) {
        StringBuffer patchstring = new StringBuffer();
        for (int i = ofs; i < ofs + len; i++) {
            if ((sysex[i] & 0xff) < 0x10) patchstring.append("0");
            patchstring.append(Integer.toHexString(sysex[i] & 0xff));
        }
        return patchstring.toString();
    }

    String method2(byte[] buffer, int off, int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int v = buffer[off + i];
            if (v < 0) v = -1 * v;
            if (v < 16) sb.append('0');
            sb.append(Integer.toHexString(v));
        }
        return sb.toString();
    }
}
