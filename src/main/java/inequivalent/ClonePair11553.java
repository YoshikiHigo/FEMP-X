package inequivalent;

public class ClonePair11553 {

    String method1(String s, int maxLength) {
        if (s.length() < maxLength) {
            return s;
        }
        return s.substring(0, maxLength - 3) + "...";
    }

    String method2(String s, int length) {
        if (s.length() >= length) {
            return s.substring(0, length - 1);
        } else {
            return s;
        }
    }
}
