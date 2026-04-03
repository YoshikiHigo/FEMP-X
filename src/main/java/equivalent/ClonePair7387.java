package equivalent;

public class ClonePair7387 {
    String method1(String s, int length, char c) {
        int needed = length - s.length();
        if (needed <= 0) {
            return s;
        }
        int beginning = needed / 2;
        int end = beginning + needed % 2;
        char[] prepadding = new char[beginning];
        java.util.Arrays.fill(prepadding, c);
        char[] postpadding = new char[end];
        java.util.Arrays.fill(postpadding, c);
        String sb = String.valueOf(prepadding) +
                s +
                String.valueOf(postpadding);
        return sb;
    }

    String method2(String s, int length, char c) {
        int needed = length - s.length();
        if (needed <= 0) {
            return s;
        }
        int beginning = needed / 2;
        int end = beginning + needed % 2;
        StringBuffer sb = new StringBuffer(length);
        for (int i = 0; i < beginning; i++) {
            sb.append(c);
        }
        sb.append(s);
        for (int i = 0; i < end; i++) {
            sb.append(c);
        }
        return (sb.toString());
    }
}
