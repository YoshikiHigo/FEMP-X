package equivalent;

public class ClonePair13541 {
    byte[] method1(String s) {
        byte[] out = new byte[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            out[i / 2] = (byte) Integer.parseInt(s.substring(i, i + 2), 16);
        }
        return out;
    }

    byte[] method2(String hexString) {
        byte[] myByte = new byte[hexString.length() / 2];
        for (int x = 0; x < hexString.length(); x += 2) {
            int intValue = Integer.parseInt(hexString.substring(x, x + 2), 16);
            myByte[x / 2] = (byte) intValue;
        }
        return myByte;
    }
}
