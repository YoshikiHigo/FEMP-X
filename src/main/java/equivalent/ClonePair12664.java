package equivalent;

public class ClonePair12664 {
    String method1(String in, char delim) {
        char[] chars = in.toCharArray();
        int c = chars.length - 1;
        boolean found = false;
        while (c >= 0 && !found) {
            if (chars[c--] != delim) found = true;
        }
        String ret = "";
        if (found) ret = String.valueOf(chars, 0, c + 2);
        return ret;
    }

    String method2(String source, char target) {
        int i = source.length() - 1;
        while (i >= 0 && source.charAt(i) == target) i--;
        return source.substring(0, i + 1);
    }
}
