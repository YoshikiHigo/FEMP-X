package equivalent;

public class ClonePair13562 {
    byte[] method1(String hexText) {
        String chunk = null;
        if (hexText != null && hexText.length() > 0) {
            int numBytes = hexText.length() / 2;
            byte[] rawToByte = new byte[numBytes];
            int offset = 0;
            for (int i = 0; i < numBytes; i++) {
                chunk = hexText.substring(offset, offset + 2);
                offset += 2;
                rawToByte[i] = (byte) (Integer.parseInt(chunk, 16) & 0x000000FF);
            }
            return rawToByte;
        }
        return null;
    }

    byte[] method2(String hex) {
        if (hex == null || hex.length() == 0) return null;
        byte[] b = new byte[hex.length() / 2];
        int k;
        for (int i = 0, j = 0; i < hex.length() / 2; i++, j++) {
            k = Integer.parseInt(hex.substring(j * 2, j * 2 + 2), 16) & 0xff;
            b[i] = (byte) k;
        }
        return b;
    }
}
