package equivalent;

public class ClonePair5830 {
    boolean method1(int year) {
        boolean leapYear;
        leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);
        return leapYear;
    }

    boolean method2(int year) {
        boolean flag = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        return flag;
    }
}
