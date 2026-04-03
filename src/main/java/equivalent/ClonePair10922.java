package equivalent;

public class ClonePair10922 {
    String method1(String input, int limit, String elipsis) {
        if (input == null) return null;
        if (input.length() > limit) {
            String result = input.substring(0, limit);
            if (elipsis != null) result += elipsis;
            return result;
        } else return input;
    }

    String method2(String s, int a_maxChars, String a_appendToEnd) {
        if (s == null) {
            return null;
        }
        int len = s.length();
        if (len <= a_maxChars) {
            return s;
        }
        String retour = s.substring(0, a_maxChars);
        if (a_appendToEnd != null) {
            retour += a_appendToEnd;
        }
        return retour;
    }
}
