package inequivalent;

public class ClonePair3970 {

    int method1(int[] p, int[] c, int n) {
        int i, nz = 0;
        float nz2 = 0;
        if (p == null || c == null) return (-1);
        for (i = 0; i < n; i++) {
            p[i] = nz;
            nz += c[i];
            nz2 += c[i];
            c[i] = p[i];
        }
        p[n] = nz;
        return (int) nz2;
    }

    int method2(int[] p, int[] c, int n) {
        int i, nz = 0;
        double nz2 = 0;
        if (p == null || c == null) return (-1);
        for (i = 0; i < n; i++) {
            p[i] = nz;
            nz += c[i];
            nz2 += c[i];
            c[i] = p[i];
        }
        p[n] = nz;
        return (int) nz2;
    }
}
