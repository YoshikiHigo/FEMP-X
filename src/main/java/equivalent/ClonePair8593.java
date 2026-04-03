package equivalent;

public class ClonePair8593 {
    byte[] method1(byte[] a, byte[] b) {
        if (a == null || b == null) return null;
        if (a.length != b.length) return null;
        byte[] result = new byte[a.length];
        for (int i = 0; i < result.length; i++) result[i] = (byte) (a[i] ^ b[i]);
        return result;
    }

    byte[] method2(byte[] a, byte[] b) {
        if (a == null) return null;
        if (b == null) return null;
        if (a.length != b.length) return null;
        byte[] result = new byte[a.length];
        for (int i = 0; i < result.length; i++) result[i] = (byte) (((a[i] & 0xff) ^ (b[i] & 0xff)) & 0xff);
        return result;
    }
}
