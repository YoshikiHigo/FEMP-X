package inequivalent;

public class ClonePair10727 {

    int method1(String str, int startAt) {
        int i;
        for (i = startAt; i < str.length(); ++i) if (!Character.isDigit(str.charAt(i))) break;
        return i;
    }

    int method2(String str, int i) {
        for (int len = str.length(); i < len; i++) {
            if ("0123456789".indexOf(str.charAt(i)) < 0) break;
        }
        return i;
    }
}
