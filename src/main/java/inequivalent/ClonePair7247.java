package inequivalent;

public class ClonePair7247 {

    int method1(int month, int year) {
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    int method2(int monthNumber, int yearNumber) {
        int ret = 0;
        switch (monthNumber) {
            case 4:
                ret = 30;
                break;
            case 2:
                if (yearNumber % 4 == 0) {
                    ret = 29;
                } else {
                    ret = 28;
                }
                break;
            case 6:
                ret = 30;
                break;
            case 9:
                ret = 30;
                break;
            case 11:
                ret = 30;
                break;
            default:
                ret = 31;
                break;
        }
        return ret;
    }
}
