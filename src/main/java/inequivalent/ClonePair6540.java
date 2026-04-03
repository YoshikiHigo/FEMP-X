package inequivalent;

public class ClonePair6540 {

    boolean method1(String numStr, int numBit_n, int numBit_m) {
        if (numStr != null) {
            if (numBit_m >= numBit_n && numBit_n > 0 && numBit_m > 0) {
                if (!"".equals(numStr)) {
                    return numStr.matches("\\d{" + numBit_n + "," + numBit_m + "}");
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    boolean method2(String numStr, int numBit_n, int numBit_m) {
        if (numStr != null) {
            if (!"".equals(numStr) && numBit_n >= 1 && numBit_m > numBit_n) {
                return numStr.matches("\\d{" + numBit_n + "," + numBit_m + "}\\.\\d\\d") || numStr.matches("\\d{" + numBit_n + "," + numBit_m + "}\\.\\d") || numStr.matches("\\d{" + numBit_n + "," + numBit_m + "}");
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
