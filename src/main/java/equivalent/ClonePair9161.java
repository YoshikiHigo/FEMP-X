package equivalent;

public class ClonePair9161 {
    int method1(String string, String sub) {
        if (string == null || string.length() == 0 || sub == null || sub.length() == 0) return 0;
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    int method2(String string, String other) {
        if (null == string) return 0;
        if (null == other) return 0;
        if (0 >= string.length()) return 0;
        if (0 >= other.length()) return 0;
        int count = 0;
        int index = 0;
        while ((index <= string.length() - other.length()) && (-1 != (index = string.indexOf(other, index)))) {
            count++;
            index += other.length();
        }
        return count;
    }
}
