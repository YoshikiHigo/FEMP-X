package inequivalent;

public class ClonePair7921 {

    int method1(int tstart, int[] tbuff, int vstart, int[] vertices, int stripStart, int[] stripCounts, int stripCount) {
        int t = tstart;
        int v = vstart;
        for (int i = 0; i < stripCount; i++) {
            for (int j = 0; j < stripCounts[i + stripStart] - 2; j++) {
                if ((j & 0x01) == 0) {
                    tbuff[t * 3] = vertices[v];
                    tbuff[t * 3 + 1] = vertices[v + 1];
                    tbuff[t * 3 + 2] = vertices[v + 2];
                } else {
                    tbuff[t * 3] = vertices[v + 1];
                    tbuff[t * 3 + 1] = vertices[v];
                    tbuff[t * 3 + 2] = vertices[v + 2];
                }
                t++;
                v++;
            }
            v += 2;
        }
        return t;
    }

    int method2(int tstart, int[] tbuff, int vstart, int[] vertices, int stripStart, int[] stripCounts, int stripCount) {
        int t = tstart;
        int v = vstart;
        for (int i = 0; i < stripCount; i++) {
            for (int j = 0; j < stripCounts[i + stripStart] - 2; j++) {
                tbuff[t * 3] = vertices[v];
                tbuff[t * 3 + 1] = vertices[v + j + 1];
                tbuff[t * 3 + 2] = vertices[v + j + 2];
                t++;
            }
            v += stripCounts[i + stripStart];
        }
        return t;
    }
}
