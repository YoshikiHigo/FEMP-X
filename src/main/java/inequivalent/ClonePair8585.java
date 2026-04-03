package inequivalent;

public class ClonePair8585 {

    int[][] method1(int[] array, int l1, int l2) {
        int[][] doubleArray = new int[l1][l2];
        int c = 0;
        for (int i = 0; i < l1; i++) for (int j = 0; j < l2; j++) doubleArray[i][j] = array[c++];
        return doubleArray;
    }

    int[][] method2(int[] A, int w, int h) {
        int[][] A2D = new int[w][h];
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                A2D[i][j] = A[j * w + i];
            }
        }
        return A2D;
    }
}
