package inequivalent;

public class ClonePair12632 {

    String method1(String s, char c) {
        int begin = 0;
        while (s.charAt(begin) == c) {
            ++begin;
        }
        int end = s.length() - 1;
        while (s.charAt(end) == c) {
            --end;
        }
        return s.substring(begin, end + 1);
    }

    String method2(String s, char c) {
        int start = 0;
        int end = s.length();
        if (s.charAt(start) == c) {
            start++;
        }
        if (s.charAt(end - 1) == c) {
            end--;
        }
        return s.substring(start, end);
    }
}
