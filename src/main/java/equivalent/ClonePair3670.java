package equivalent;

public class ClonePair3670 {
    String method1(String str, int len, char ch, boolean left) {
        StringBuffer buffer = null;
        int missing = len - str.length();
        if (missing <= 0) {
            return str;
        }
        buffer = new StringBuffer(len);
        if (!left) {
            buffer.append(str);
        }
        for (int i = 1; i <= missing; i++) {
            buffer.append(ch);
        }
        if (left) {
            buffer.append(str);
        }
        return buffer.toString();
    }

    String method2(String str, int len, char ch, boolean left) {
        StringBuffer buffer = null;
        int missing = len - str.length();
        if (missing <= 0) return str;
        buffer = new StringBuffer(len);
        if (!left) buffer.append(str);
        for (int i = 1; i <= missing; i++) buffer.append(ch);
        if (left) buffer.append(str);
        return buffer.toString();
    }
}
