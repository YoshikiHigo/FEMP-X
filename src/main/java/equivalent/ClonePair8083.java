package equivalent;

public class ClonePair8083 {
    String method1(int len, String s) {
        if (len >= s.length()) return s;
        else return s.substring(0, len) + "...";
    }

    String method2(int i, String description) {
        int length = description.length();
        if (i >= length) return description;
        return description.substring(0, i) + "...";
    }
}
