package inequivalent;

public class ClonePair12786 {

    double[][] method1(double[][] arg1, double[][] arg2, double[][] result) {
        int rows = arg1.length;
        int cols = arg1[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arg1[i][j] + arg2[i][j];
            }
        }
        return result;
    }

    double[][] method2(double[][] arg1, double[][] arg2, double[][] result) {
        int rows = arg1.length;
        int cols = arg1[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arg1[i][j] - arg2[i][j];
            }
        }
        return result;
    }
}
