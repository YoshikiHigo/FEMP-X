package equivalent;

public class ClonePair9028 {
    String method1(int val) {
        if (val < 10) return val + "";
        else if (val == 10) return "A";
        else if (val == 11) return "B";
        else if (val == 12) return "C";
        else if (val == 13) return "D";
        else if (val == 14) return "E";
        else if (val == 15) return "F";
        return null;
    }

    String method2(int idx) {
        switch (idx) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return null;
        }
    }
}
