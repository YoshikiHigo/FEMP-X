package equivalent;

public class ClonePair1812 {
    String method1(byte[] data) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            if (b < 0) sb.append(Integer.toHexString(256 + b));
            else if (b < 16) sb.append("0").append(Integer.toHexString(b));
            else sb.append(Integer.toHexString(b));
        }
        return sb.toString();
    }

    String method2(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            if (b < 0) sb.append(Integer.toHexString(256 + b));
            else if (b < 16) sb.append("0").append(Integer.toHexString(b));
            else sb.append(Integer.toHexString(b));
        }
        return sb.toString();
    }
}
