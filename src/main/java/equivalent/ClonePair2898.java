package equivalent;

public class ClonePair2898 {
    boolean method1(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            if ((b < 32 && b != 9 && b != 10 && b != 13 && b != 0) || b == 127) return false;
        }
        return true;
    }

    boolean method2(byte[] bytes) {
        for (byte b : bytes) {
            if ((b < 32 && b != 9 && b != 10 && b != 13 && b != 0) || b == 127) {
                return false;
            }
        }
        return true;
    }
}
