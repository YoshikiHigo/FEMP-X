package equivalent;

public class ClonePair7942 {
    boolean method1(byte[] byte0, int i, byte[] byte1, int j, int k) {
        for (int l = 0; l < k; l++) if (byte0[i + l] != byte1[j + l]) return false;
        return true;
    }

    boolean method2(byte[] a1, int offs1, byte[] a2, int offs2, int num) {
        while (num-- > 0) if (a1[offs1++] != a2[offs2++]) return false;
        return true;
    }
}
