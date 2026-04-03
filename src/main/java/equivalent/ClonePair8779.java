package equivalent;

public class ClonePair8779 {
    boolean method1(char c) {
        switch (c) {
            case 0x00B7:
            case 0x02D0:
            case 0x02D1:
            case 0x0387:
            case 0x0640:
            case 0x0E46:
            case 0x0EC6:
            case 0x3005:
                return true;
            default:
                if ((c >= 0x3031) && (c <= 0x3035)) return true;
                if ((c >= 0x309D) && (c <= 0x309E)) return true;
                return (c >= 0x30FC) && (c <= 0x30FE);
        }
    }

    boolean method2(char c) {
        if (c < 0x00B6) return false;
        if (c == 0x00B7) return true;
        if (c == 0x02D0) return true;
        if (c == 0x02D1) return true;
        if (c == 0x0387) return true;
        if (c == 0x0640) return true;
        if (c == 0x0E46) return true;
        if (c == 0x0EC6) return true;
        if (c == 0x3005) return true;
        if (c < 0x3031) return false;
        if (c <= 0x3035) return true;
        if (c < 0x309D) return false;
        if (c <= 0x309E) return true;
        if (c < 0x30FC) return false;
        return c <= 0x30FE;
    }
}
