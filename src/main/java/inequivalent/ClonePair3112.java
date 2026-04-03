package inequivalent;

public class ClonePair3112 {

    boolean method1(byte[] raw) {
        long chksum = 0;
        int count = raw.length - 4;
        long ecx = -1;
        int i = 0;
        try {
            for (i = 0; i < count; i += 4) {
                ecx = raw[i] & 0xff;
                ecx |= raw[i + 1] << 8 & 0xff00;
                ecx |= raw[i + 2] << 0x10 & 0xff0000;
                ecx |= raw[i + 3] << 0x18 & 0xff000000;
                chksum ^= ecx;
            }
            ecx = raw[i] & 0xff;
            ecx |= raw[i + 1] << 8 & 0xff00;
            ecx |= raw[i + 2] << 0x10 & 0xff0000;
            ecx |= raw[i + 3] << 0x18 & 0xff000000;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
        }
        return ecx == chksum;
    }

    boolean method2(byte[] raw) {
        long chksum = 0;
        int count = raw.length - 4;
        long ecx = -1;
        int i = 0;
        try {
            for (i = 0; i < count; i += 4) {
                ecx = raw[i] & 0xff;
                ecx |= raw[i + 1] << 8 & 0xff00;
                ecx |= raw[i + 2] << 0x10 & 0xff0000;
                ecx |= raw[i + 3] << 0x18 & 0xff000000;
                chksum ^= ecx;
            }
            ecx = raw[i] & 0xff;
            ecx |= raw[i + 1] << 8 & 0xff00;
            ecx |= raw[i + 2] << 0x10 & 0xff0000;
            ecx |= raw[i + 3] << 0x18 & 0xff000000;
            i = i - 4;
            raw[i] = (byte) (chksum & 0xff);
            raw[i + 1] = (byte) (chksum >> 0x08 & 0xff);
            raw[i + 2] = (byte) (chksum >> 0x10 & 0xff);
            raw[i + 3] = (byte) (chksum >> 0x18 & 0xff);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
        }
        return ecx == chksum;
    }
}
