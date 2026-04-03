package inequivalent;

public class ClonePair13341 {

    byte[] method1(String hex) {
        hex = hex.replaceAll(" ", "");
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < hex.length(); i += 2) {
            int num = Integer.parseInt(hex.substring(i, i + 2), 16);
            bytes[i / 2] = (byte) num;
        }
        return bytes;
    }

    byte[] method2(String hexString) {
        byte[] bytes = new byte[hexString.length() / 2];
        for (int i = 0; i < hexString.length(); i = i + 2) {
            String hex = hexString.substring(i, i + 2);
            int b = Integer.parseInt(hex, 16);
            bytes[i / 2] = b > 128 ? (byte) (b - 256) : (byte) b;
        }
        return bytes;
    }
}
