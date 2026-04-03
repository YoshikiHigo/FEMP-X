package equivalent;

public class ClonePair5948 {
    boolean method1(String pattern, String str) {
        if (pattern.equals("*")) {
            return true;
        } else if (pattern.startsWith("*")) {
            if (pattern.endsWith("*")) {
                if (pattern.length() == 2) return true;
                return str.indexOf(pattern.substring(1, pattern.length() - 1)) >= 0;
            }
            return str.endsWith(pattern.substring(1));
        } else if (pattern.endsWith("*")) {
            return str.startsWith(pattern.substring(0, pattern.length() - 1));
        } else {
            return str.equals(pattern);
        }
    }

    boolean method2(String pattern, String str) {
        if (pattern.equals("*")) {
            return true;
        } else if (pattern.startsWith("*")) {
            if (pattern.endsWith("*")) {
                if (pattern.length() == 2) {
                    return true;
                }
                return str.indexOf(pattern.substring(1, pattern.length() - 1)) >= 0;
            }
            return str.endsWith(pattern.substring(1));
        } else if (pattern.endsWith("*")) {
            return str.startsWith(pattern.substring(0, pattern.length() - 1));
        } else {
            return str.equals(pattern);
        }
    }
}
