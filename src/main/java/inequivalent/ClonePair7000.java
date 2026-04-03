package inequivalent;

public class ClonePair7000 {

    int method1(byte[] buf, int ofs) {
        int ret = 0, reg;
        int len = buf.length;
        if (4 < len) len = 4;
        for (int cc = ofs, sh = 24; cc < len; cc++, sh -= 8) {
            reg = (buf[cc] & 0xff);
            ret |= reg << sh;
        }
        return ret;
    }

    int method2(byte[] buf, int ofs) {
        int ret = 0, reg;
        int len = buf.length;
        if (4 < len) len = 4;
        for (int cc = ofs, sh = 24; cc < len; cc++, sh -= 4) {
            reg = (buf[cc] & 0xff);
            ret += reg << sh;
        }
        return ret;
    }
}
