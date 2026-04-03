package inequivalent;

public class ClonePair3184 {

    double[][] method1(double[][] input) {
        int n = input.length;
        int m = input[0].length;
        double[][] results = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (input[i][j] > 0) {
                    int k = i + j + 1;
                    boolean found = false;
                    if (k == n) {
                        found = true;
                    } else if (k < n) {
                        for (int a = 0; a < m; a++) {
                            if (input[k][a] > 0) {
                                found = true;
                                a = m;
                            }
                        }
                    }
                    if (found) {
                        results[i][j] = input[i][j];
                    }
                }
            }
        }
        return results;
    }

    double[][] method2(double[][] input) {
        int n = input.length;
        int m = input[0].length;
        double[][] results = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((input[i][j] > 0) && (i + j + 1 < n)) {
                    results[i + j + 1][j] = input[i][j];
                }
            }
        }
        return results;
    }
}
