package equivalent;

public class ClonePair6116 {
    int method1(int year, int month) {
        switch (month) {
            case 1:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return 29;
                else return 28;
            case 3:
                return 30;
            case 5:
                return 30;
            case 8:
                return 30;
            case 10:
                return 30;
            default:
                return 31;
        }
    }

    int method2(int year, int month) {
        switch (month) {
            case 1:
                return (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) ? 29 : 28;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default:
                return 31;
        }
    }
}
