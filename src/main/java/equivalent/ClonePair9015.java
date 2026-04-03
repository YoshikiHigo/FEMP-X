package equivalent;

public class ClonePair9015 {
    int method1(String str, int i) {
        if (i < str.length() && (str.charAt(i) == '\'' || str.charAt(i) == '"')) {
            i++;
        }
        return i;
    }

    int method2(String str, int i) {
        if (i < str.length() && (str.charAt(i) == '\'' || str.charAt(i) == '"')) i++;
        return i;
    }
}
