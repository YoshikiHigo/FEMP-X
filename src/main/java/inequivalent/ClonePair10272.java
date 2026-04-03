package inequivalent;

public class ClonePair10272 {

    int method1(byte[] mpb, int start, int len) {
        int uint = 0;
        for (int i = 0; i < len; i++) {
            uint += (mpb[i + start] & 0xFF) << ((len - i - 1) * 8);
        }
        return uint;
    }

    int method2(byte[] sbuf, int pos, int numBytes) {
        int result = 0;
        for (int i = 0; i < numBytes; i++) result = (result << 8) + (sbuf[pos + i] & 0xff);
        return result;
    }
}
