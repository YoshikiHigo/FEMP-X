package inequivalent;

public class ClonePair6255 {

    double[][] method1(double[][] mat1, double[][] mat2, int row, int col) {
        double[][] mat = new double[row][col];
        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < col) {
                int jj = 0;
                int val = 0;
                while (jj < row) {
                    mat[i][j] += mat1[i][jj] * mat2[jj][j];
                    jj++;
                }
                j++;
            }
            i++;
        }
        return mat;
    }

    double[][] method2(double[][] mat1, double[][] mat2, int row, int col) {
        int i = 0;
        double[][] newmat = new double[row][col];
        while (i < row) {
            int j = 0;
            while (j < col) {
                newmat[i][j] = mat1[i][j] + mat2[i][j];
                j++;
            }
            i++;
        }
        return newmat;
    }
}
