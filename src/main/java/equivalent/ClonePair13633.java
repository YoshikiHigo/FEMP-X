package equivalent;

public class ClonePair13633 {
    byte[] method1(String device) {
        int len = device.length() / 2;
        byte[] data = new byte[len];
        for (int i = len - 1; i >= 0; i--) {
            data[i] = (byte) Integer.parseInt(device.substring(i * 2, i * 2 + 2), 16);
        }
        return data;
    }

    byte[] method2(String s) {
        byte[] bb = new byte[s.length() / 2];
        int ii;
        for (int i = 0; i < bb.length; i++) {
            ii = Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
            if (ii > 127) {
                ii = ii - 256;
            }
            bb[i] = (byte) ii;
        }
        return bb;
    }
}
