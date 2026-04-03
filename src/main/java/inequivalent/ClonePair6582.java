package inequivalent;

public class ClonePair6582 {

    String method1(double[][] A, int opt) {
        String s = "";
        int m = A.length;
        if (opt == 1) for (int i = 0; i < m; i++) {
            for (int j = 0; j < A[i].length; j++)
                if (j == (A[i].length - 1)) s += A[i][j] + "\n";
                else s += A[i][j] + " ";
        }
        else if (opt == 2) for (int j = 0; j < A[0].length; j++)
            for (int i = 0; i < m; i++)
                if (i == (m - 1)) s += A[i][j] + "\n";
                else s += A[i][j] + " ";
        return s;
    }

    String method2(double[][] A, int opt) {
        String s = "";
        int m = A.length;
        if (opt == 1) for (int i = 0; i < m; i++) {
            try {
                for (int j = 0; j < A[i].length; j++)
                    if (j == (A[i].length - 1)) s += A[i][j] + "\n";
                    else s += A[i][j] + " ";
            } catch (NullPointerException e) {
                System.err.println("NULLPOINTER EXCEPT AT i=" + i);
            }
        }
        else if (opt == 2) for (int j = 0; j < A[0].length; j++)
            for (int i = 0; i < m; i++)
                if (i == (m - 1)) s += A[i][j] + "\n";
                else s += A[i][j] + " ";
        return s;
    }
}
