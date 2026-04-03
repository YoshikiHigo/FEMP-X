package inequivalent;

public class ClonePair5125 {

    int[][] method1(int size, int tt) {
        int[][] ttm = new int[size][size];
        if (tt != 0) {
            for (int cntr = 0; cntr < size; cntr++) {
                for (int loop = 0; loop < size; loop++) {
                    ttm[cntr][loop] = tt;
                }
            }
        }
        return ttm;
    }

    int[][] method2(int N, int mode) {
        int[][] H = new int[N][N];
        switch (mode) {
            case (1):
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i < N / 2) {
                            H[i][j] = -1;
                        } else {
                            H[i][j] = 1;
                        }
                    }
                }
                break;
            case (2):
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i < N / 2) {
                            H[i][j] = 1;
                        } else {
                            H[i][j] = -1;
                        }
                    }
                }
                break;
            case (3):
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (j < N / 2) {
                            H[i][j] = -1;
                        } else {
                            H[i][j] = 1;
                        }
                    }
                }
                break;
            case (4):
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (j < N / 2) {
                            H[i][j] = 1;
                        } else {
                            H[i][j] = -1;
                        }
                    }
                }
                break;
            default:
                break;
        }
        return H;
    }
}
