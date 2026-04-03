package inequivalent;

public class ClonePair11548 {

    String method1(int i) {
        String result = "" + i;
        if (i > 3 && i < 20) {
            result += "th";
        } else if (i % 10 == 1) {
            result += "st";
        } else if (i % 10 == 2) {
            result += "nd";
        } else if (i % 10 == 3) {
            result += "rd";
        } else {
            result += "th";
        }
        return result;
    }

    String method2(int n) {
        String st = Integer.toString(n);
        if (((n % 100) >= 11) && ((n % 100) <= 13)) {
            return st + "th";
        } else if (n % 10 == 1) {
            return st + "st";
        } else if (n % 10 == 2) {
            return st + "nd";
        } else if (n % 10 == 3) {
            return st + "rd";
        } else {
            return st + "th";
        }
    }
}
