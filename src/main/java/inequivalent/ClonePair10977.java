package inequivalent;

public class ClonePair10977 {

    byte method1(char encoded) {
        if (encoded >= 'A' && encoded <= 'Z') {
            return (byte) (encoded - 'A');
        }
        if (encoded >= 'a' && encoded <= 'z') {
            return (byte) (encoded - 'a' + 26);
        }
        if (encoded >= '0' && encoded <= '9') {
            return (byte) (encoded - '0' + 52);
        }
        if (encoded == '+') return (byte) 62;
        if (encoded == '/') return (byte) 63;
        return (byte) -1;
    }

    byte method2(char c) {
        byte b = (byte) c;
        if (b >= 0x41 && b <= 0x5A) {
            return (byte) (b - 0x41);
        }
        if (b >= 0x61 && b <= 0x7A) {
            return (byte) (b - 0x61 + 26);
        }
        if (b >= 0x30 && b <= 0x39) {
            return (byte) (b - 0x30 + 52);
        }
        if (b == 0x2B) {
            return 62;
        }
        if (b == 0x2F) {
            return 63;
        }
        return -1;
    }
}
