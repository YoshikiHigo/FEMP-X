package inequivalent;

public class ClonePair8994 {

    boolean method1(double[][] val) {
        int rowC = val.length;
        for (int diagI = 0; diagI < rowC; diagI++) {
            if (val[diagI][diagI] != 1.0) return false;
        }
        for (int rowI = 0; rowI < rowC; rowI++) {
            for (int colI = 0; colI < rowC; colI++) {
                if (colI == rowI) continue;
                if (val[rowI][colI] != 0.0) return false;
            }
        }
        return true;
    }

    boolean method2(double[][] val) {
        for (int diagI = 0; diagI < 2; diagI++) {
            if (val[diagI][diagI] != 1.0) return false;
        }
        for (int rowI = 0; rowI < 2; rowI++) {
            for (int colI = 0; colI < 2; colI++) {
                if (colI == rowI) continue;
                if (val[rowI][colI] != 0.0) return false;
            }
        }
        return true;
    }
}
