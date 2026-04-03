package equivalent;

public class ClonePair12592 {
    String method1(String s, char c) {
        boolean b = false;
        if (s == null || s.length() == 0) return s;
        int n = 0;
        int len = s.length();
        while (n < len && s.charAt(n) == c) {
            n++;
            b = true;
        }
        if (b) s = s.substring(n);
        return s;
    }

    String method2(String input, char prefix) {
        if (input == null || input.length() == 0 || input.charAt(0) != prefix) {
            return input;
        }
        int nonPrefixPosition = 1;
        while (nonPrefixPosition < input.length() && input.charAt(nonPrefixPosition) == prefix) {
            ++nonPrefixPosition;
        }
        return input.substring(nonPrefixPosition);
    }
}
