package equivalent;

public class ClonePair11905 {
    String method1(int number) {
        String str = Integer.toString(number);
        if (number >= 0 && number < 1000) {
            str = '0' + str;
            if (number < 100) {
                str = '0' + str;
            }
            if (number < 10) {
                str = '0' + str;
            }
        }
        return str;
    }

    String method2(int num) {
        String t = "";
        if (num >= 0 && num < 10) {
            t = "000" + num;
        } else if (num >= 10 && num < 100) {
            t = "00" + num;
        } else if (num >= 100 && num < 1000) {
            t = "0" + num;
        } else {
            t = "" + num;
        }
        return t;
    }
}
