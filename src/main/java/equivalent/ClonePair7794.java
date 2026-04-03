package equivalent;

public class ClonePair7794 {
    Object method1(byte[] buf) {
        int n = buf.length / 4;
        float[] a = new float[n];
        int i = 0;
        int j = 0;
        while (i < n) {
            a[i++] = Float.intBitsToFloat(((buf[j++] & 0xFF) << 24) + ((buf[j++] & 0xFF) << 16) + ((buf[j++] & 0xFF) << 8) + (buf[j++] & 0xFF));
        }
        return a;
    }

    Object method2(byte[] buf) {
        int n = buf.length / 4;
        float[] a = new float[n];
        int i = 0, j = 0;
        while (i < n) {
            a[i++] = Float.intBitsToFloat(((buf[j++] & 0xFF) << 24) + ((buf[j++] & 0xFF) << 16) + ((buf[j++] & 0xFF) << 8) + (buf[j++] & 0xFF));
        }
        return a;
    }
}
