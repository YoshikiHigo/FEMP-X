package inequivalent;

public class ClonePair5781 {

    boolean method1(int number) {
        String s = Integer.toString(number);
        if (s.endsWith("1")) {
            return false;
        } else if (s.endsWith("3")) {
            return false;
        } else if (s.endsWith("5")) {
            return false;
        } else if (s.endsWith("7")) {
            return false;
        } else return !s.endsWith("9");
    }

    boolean method2(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 400 == 0;
    }
}
