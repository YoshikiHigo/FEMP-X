package inequivalent;

public class ClonePair5764 {

    boolean method1(StringBuffer buffer, int startIndex, String match) {
        boolean result = false;
        final int i = startIndex;
        int j = 0;
        for (; j < match.length(); j++) {
            if (buffer.charAt(j + i) != match.charAt(j)) {
                break;
            }
        }
        if (j == match.length()) {
            result = true;
        }
        return result;
    }

    boolean method2(StringBuffer buffer, int startIndex, String match) {
        boolean result = false;
        final int i = startIndex;
        int j = 0;
        for (; j < match.length(); j++) {
            if (Character.toUpperCase(buffer.charAt(j + i)) != Character.toUpperCase(match.charAt(j))) {
                break;
            }
        }
        if (j == match.length()) {
            result = true;
        }
        return result;
    }
}
