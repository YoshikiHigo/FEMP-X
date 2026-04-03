package inequivalent;

public class ClonePair142 {

    boolean method1(boolean[][] a, boolean[][] b) {
        if (a.length < 1) return false;
        if (b.length < 1) return false;
        if (a.length != b.length) return false;
        for (int y = 0; y < a.length; y++) {
            if (a[y].length != b[y].length) return false;
            for (int x = 0; x < a[y].length; x++) {
                if (a[y][x] != b[y][x]) return false;
            }
        }
        return true;
    }

    boolean method2(boolean[][] m1, boolean[][] m2) {
        if (m1.length != m2.length) return false;
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) return false;
            for (int j = 0; j < m1[i].length; j++) {
                boolean b1 = m1[i][j];
                boolean b2 = m2[i][j];
                if (b1 != b2) return false;
            }
        }
        return true;
    }
}
