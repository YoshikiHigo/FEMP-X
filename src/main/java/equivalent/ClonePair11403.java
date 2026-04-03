package equivalent;

public class ClonePair11403 {
    String method1(String str, int limit) {
        if (str.length() <= limit) return str;
        String s0 = str.substring(0, limit);
        s0 += "...";
        return s0;
    }

    String method2(String src, int length) {
        if (src.length() <= length) {
            return src;
        } else {
            String tmp = src.substring(0, length);
            tmp = tmp + "...";
            return tmp;
        }
    }
}
