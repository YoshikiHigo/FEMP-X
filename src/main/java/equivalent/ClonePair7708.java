package equivalent;

public class ClonePair7708 {
    int method1(byte val) {
        if ((val >= 'a') && (val <= 'f')) {
            return val - 'a' + 10;
        } else if ((val >= 'A') && (val <= 'F')) {
            return val - 'A' + 10;
        } else if ((val >= '0') && (val <= '9')) {
            return val - '0';
        } else {
            return -1;
        }
    }

    int method2(byte c) {
        if (c >= '0' && c <= '9') {
            return (c - '0');
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 'A' + 10);
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a' + 10);
        }
        return (-1);
    }
}
