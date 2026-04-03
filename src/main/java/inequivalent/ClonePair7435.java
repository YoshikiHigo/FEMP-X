package inequivalent;

public class ClonePair7435 {

    int method1(int number) {
        if (number == 0) return 0;
        if ((number & 0x0001) > 0) return 0;
        if ((number & 0x0002) > 0) return 1;
        if ((number & 0x0004) > 0) return 2;
        if ((number & 0x0008) > 0) return 3;
        if ((number & 0x0010) > 0) return 4;
        if ((number & 0x0020) > 0) return 5;
        if ((number & 0x0040) > 0) return 6;
        if ((number & 0x0080) > 0) return 7;
        if ((number & 0x0100) > 0) return 8;
        if ((number & 0x0200) > 0) return 9;
        if ((number & 0x0400) > 0) return 10;
        if ((number & 0x0800) > 0) return 11;
        if ((number & 0x1000) > 0) return 12;
        if ((number & 0x2000) > 0) return 13;
        if ((number & 0x4000) > 0) return 14;
        return 15;
    }

    int method2(int word) {
        int i = 0;
        while ((word & 0xF) == 0) {
            word >>= 4;
            i += 4;
        }
        if ((word & 3) == 0) {
            word >>= 2;
            i += 2;
        }
        if ((word & 1) == 0) i += 1;
        return i;
    }
}
