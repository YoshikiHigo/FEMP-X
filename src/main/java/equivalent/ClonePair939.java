package equivalent;

public class ClonePair939 {
    String method1(byte[] d, int o) {
        int start = o;
        while (d[o] != 0 && o < d.length) o++;
        byte[] str = new byte[o - start];
        System.arraycopy(d, start, str, 0, o - start);
        return new String(str);
    }

    String method2(byte[] bytes, int off) {
        int len = 0;
        while (true) {
            if (bytes[off + len] == 0) {
                break;
            }
            len++;
        }
        return new String(bytes, off, len);
    }
}
