package equivalent;

public class ClonePair9163 {
    boolean method1(byte byteToCheck) {
        switch (byteToCheck) {
            case ' ':
            case '\n':
            case '\r':
            case '\t':
                return true;
            default:
                return false;
        }
    }

    boolean method2(byte b) {
        switch (b) {
            case 13:
            case 10:
            case 32:
            case 9:
                return true;
        }
        return false;
    }
}
