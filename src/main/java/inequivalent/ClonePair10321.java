package inequivalent;

public class ClonePair10321 {

    int method1(byte[] p, int off, int len) {
        int ret = 0;
        int done = off + len;
        for (int i = off; i < done; i++) ret = ((ret << 8) & 0xffffffff) + (p[i] & 0xff);
        return ret;
    }

    int method2(byte[] bytes, int pos, int cnt) {
        int value = 0;
        for (int i = 0; i < cnt; i++) value |= ((bytes[pos + cnt - i - 1] & 0xff) << 8 * i);
        return value;
    }
}
