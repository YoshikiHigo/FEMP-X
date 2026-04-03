package inequivalent;

public class ClonePair8618 {

    String[] method1(double fractionalDate) {
        String[] yearMonthDay = new String[3];
        int year = (int) fractionalDate;
        String yearString;
        if (year < 0) {
            yearMonthDay[0] = "" + year;
            yearMonthDay[1] = "" + 0;
            yearMonthDay[2] = "" + 0;
            return yearMonthDay;
        } else if (year < 10) {
            yearString = "000" + year;
        } else if (year < 100) {
            yearString = "00" + year;
        } else if (year < 1000) {
            yearString = "0" + year;
        } else {
            yearString = "" + year;
        }
        yearMonthDay[0] = yearString;
        double fractionalMonth = fractionalDate - year;
        int month = ((int) (12.0 * fractionalMonth)) + 1;
        String monthString;
        if (month < 10) {
            monthString = "0" + month;
        } else {
            monthString = "" + month;
        }
        yearMonthDay[1] = monthString;
        int day = ((int) Math.round(30 * ((12 * fractionalMonth + 1) - month)) + 1);
        String dayString;
        if (day < 10) {
            dayString = "0" + day;
        } else {
            dayString = "" + day;
        }
        yearMonthDay[2] = dayString;
        return yearMonthDay;
    }

    String[] method2(double fractionalDate) {
        String[] yearMonthDay = new String[3];
        int year = (int) fractionalDate;
        String yearString;
        if (year < 10) {
            yearString = "000" + year;
        } else if (year < 100) {
            yearString = "00" + year;
        } else if (year < 1000) {
            yearString = "0" + year;
        } else {
            yearString = "" + year;
        }
        yearMonthDay[0] = yearString;
        double fractionalMonth = fractionalDate - year;
        int month = (int) (12.0 * fractionalMonth);
        String monthString;
        if (month < 10) {
            monthString = "0" + month;
        } else {
            monthString = "" + month;
        }
        yearMonthDay[1] = monthString;
        int day = (int) Math.round(30 * (12 * fractionalMonth - month));
        String dayString;
        if (day < 10) {
            dayString = "0" + day;
        } else {
            dayString = "" + day;
        }
        yearMonthDay[2] = dayString;
        return yearMonthDay;
    }
}
