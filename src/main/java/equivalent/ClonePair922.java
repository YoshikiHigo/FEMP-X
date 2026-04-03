package equivalent;

public class ClonePair922 {
    String method1(byte[] buf, int off) {
        String ret;
        if ((buf.length - off) > 0) {
            ret = String.format("%02x", buf[off]);
            for (int i = off + 1; i < buf.length; i++) {
                ret = ret + "_" + String.format("%02x", buf[i]);
            }
        } else {
            ret = "";
        }
        return ret;
    }

    String method2(byte[] buffer, int offset) {
        StringBuffer dump = new StringBuffer();
        if ((buffer.length - offset) > 0) {
            dump.append(String.format("%02x", buffer[offset]));
            for (int i = offset + 1; i < buffer.length; i++) {
                dump.append("_");
                dump.append(String.format("%02x", buffer[i]));
            }
        }
        return dump.toString();
    }
}
