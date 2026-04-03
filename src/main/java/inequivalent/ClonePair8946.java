package inequivalent;

public class ClonePair8946 {

    int[][] method1(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a.length];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int Min = Integer.MAX_VALUE;
                for (int k = 0; k < a.length; k++) {
                    if (a[i][k] == Integer.MAX_VALUE || b[k][j] == Integer.MAX_VALUE) {
                        sum = Integer.MAX_VALUE;
                    } else {
                        sum = a[i][k] + b[k][j];
                    }
                    if (sum < Min) {
                        Min = sum;
                    }
                }
                result[i][j] = Min;
            }
        }
        return result;
    }

    int[][] method2(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (B[i][j] >= 0) {
                    result[i][j] = A[i][j];
                } else {
                    result[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        return result;
    }
}
