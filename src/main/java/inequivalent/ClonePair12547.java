package inequivalent;

public class ClonePair12547 {

    boolean method1(int month, int day, int year) {
        if ((month < 0) || (month > 11)) {
            return false;
        }
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 1) {
            int febMax = 28;
            if ((year % 4) == 0) {
                febMax = 29;
            }
            return (day >= 1) && (day <= febMax);
        } else return (day >= 1) && (day <= months[month]);
    }

    boolean method2(int month, int day, int year) {
        if ((month < 0) || (month > 11)) {
            return false;
        }
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 1) {
            int febMax = 28;
            if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
                febMax = 29;
            }
            return (day >= 1) && (day <= febMax);
        } else return (day >= 1) && (day <= months[month]);
    }
}
