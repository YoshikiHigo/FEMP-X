package inequivalent;

public class ClonePair10151 {

    int method1(byte[] buf, int offs, int len) {
        int ret = 0;
        for (int i = 0; i < len; i++) {
            int b = buf[offs + i];
            if (b < 0) b += 256;
            ret = (ret << 8) + b;
        }
        return ret;
    }

    int method2(byte[] b, int offset, int size) {
        int num = 0;
        int sw = 8 * (size - 1);
        for (int loop = 0; loop < size; loop++) {
            num |= ((int) b[offset + loop] & 0x00ff) << sw;
            sw -= 8;
        }
        return num;
    }
}
