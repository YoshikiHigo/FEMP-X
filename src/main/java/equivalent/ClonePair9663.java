package equivalent;

public class ClonePair9663 {
    String method1(int i) {
        if (i < 10) {
            return "000" + i;
        } else if (i < 100) {
            return "00" + i;
        } else if (i < 1000) {
            return "0" + i;
        } else {
            return "" + i;
        }
    }

    String method2(int i) {
        if (i < 10) {
            return "000" + i;
        }
        if (i < 100) {
            return "00" + i;
        }
        if (i < 1000) {
            return "0" + i;
        }
        return String.valueOf(i);
    }
}
