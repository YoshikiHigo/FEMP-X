package equivalent;

import java.util.Calendar;

public class ClonePair6559 {
    String method1(int month) {
        if (Calendar.JANUARY == month) {
            return "January";
        } else if (Calendar.FEBRUARY == month) {
            return "February";
        } else if (Calendar.MARCH == month) {
            return "March";
        } else if (Calendar.APRIL == month) {
            return "April";
        } else if (Calendar.MAY == month) {
            return "May";
        } else if (Calendar.JUNE == month) {
            return "June";
        } else if (Calendar.JULY == month) {
            return "July";
        } else if (Calendar.AUGUST == month) {
            return "August";
        } else if (Calendar.SEPTEMBER == month) {
            return "September";
        } else if (Calendar.OCTOBER == month) {
            return "October";
        } else if (Calendar.NOVEMBER == month) {
            return "November";
        } else if (Calendar.DECEMBER == month) {
            return "December";
        }
        return null;
    }

    String method2(int month) {
        String result = null;
        if (month == Calendar.JANUARY) {
            result = "January";
        } else if (month == Calendar.FEBRUARY) {
            result = "February";
        } else if (month == Calendar.MARCH) {
            result = "March";
        } else if (month == Calendar.APRIL) {
            result = "April";
        } else if (month == Calendar.MAY) {
            result = "May";
        } else if (month == Calendar.JUNE) {
            result = "June";
        } else if (month == Calendar.JULY) {
            result = "July";
        } else if (month == Calendar.AUGUST) {
            result = "August";
        } else if (month == Calendar.SEPTEMBER) {
            result = "September";
        } else if (month == Calendar.OCTOBER) {
            result = "October";
        } else if (month == Calendar.NOVEMBER) {
            result = "November";
        } else if (month == Calendar.DECEMBER) {
            result = "December";
        }
        return result;
    }
}
