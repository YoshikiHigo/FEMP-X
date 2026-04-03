package equivalent;

import java.util.Calendar;

public class ClonePair6646 {
    int method1(int month) {
        if (month == 1) return Calendar.JANUARY;
        else if (month == 2) return Calendar.FEBRUARY;
        else if (month == 3) return Calendar.MARCH;
        else if (month == 4) return Calendar.APRIL;
        else if (month == 5) return Calendar.MAY;
        else if (month == 6) return Calendar.JUNE;
        else if (month == 7) return Calendar.JULY;
        else if (month == 8) return Calendar.AUGUST;
        else if (month == 9) return Calendar.SEPTEMBER;
        else if (month == 10) return Calendar.OCTOBER;
        else if (month == 11) return Calendar.NOVEMBER;
        else if (month == 12) return Calendar.DECEMBER;
        else return Calendar.JANUARY;
    }

    int method2(int month) {
        if (month == 1) {
            return Calendar.JANUARY;
        } else if (month == 2) {
            return Calendar.FEBRUARY;
        } else if (month == 3) {
            return Calendar.MARCH;
        } else if (month == 4) {
            return Calendar.APRIL;
        } else if (month == 5) {
            return Calendar.MAY;
        } else if (month == 6) {
            return Calendar.JUNE;
        } else if (month == 7) {
            return Calendar.JULY;
        } else if (month == 8) {
            return Calendar.AUGUST;
        } else if (month == 9) {
            return Calendar.SEPTEMBER;
        } else if (month == 10) {
            return Calendar.OCTOBER;
        } else if (month == 11) {
            return Calendar.NOVEMBER;
        } else if (month == 12) {
            return Calendar.DECEMBER;
        } else {
            return Calendar.JANUARY;
        }
    }
}
