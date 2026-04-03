package inequivalent;

public class ClonePair13558 {

    byte[] method1(String hexEncodedByteString) {
        if (hexEncodedByteString.length() % 2 != 0) {
            System.out.println("Hex encoded string must be of even length");
            return null;
        }
        byte[] bytes = new byte[hexEncodedByteString.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hexEncodedByteString.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }

    byte[] method2(String s) {
        if ((s.length() % 2) != 0) return null;
        byte[] result = new byte[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            String part = s.substring(i, i + 2);
            result[i / 2] = (byte) Integer.parseInt(part, 16);
        }
        return result;
    }
}
