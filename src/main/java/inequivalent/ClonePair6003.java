package inequivalent;

public class ClonePair6003 {

    int[][] method1(int[][] z, int nf, int nc) {
        int[][] aux = new int[nf][nc];
        for (int i = 0; i < nc; i++)
            for (int j = 0; j < nf; j++) {
                aux[j][i] = z[nf - 1 - j][i];
            }
        return aux;
    }

    int[][] method2(int[][] z, int nf, int nc) {
        int[][] aux = new int[nf][nc];
        for (int i = 0; i < nf; i++)
            for (int j = 0; j < nc; j++) {
                aux[i][j] = z[i][nc - 1 - j];
            }
        return aux;
    }
}
