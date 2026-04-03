package equivalent;

public class ClonePair5745 {
    boolean method1(String name, int i, String replacement) {
        return name.length() >= i + replacement.length() && name.startsWith(replacement, i);
    }

    boolean method2(String seq, int start, String match) {
        if (seq.length() - start < match.length()) {
            return false;
        }
        for (int i = 0; i < match.length(); i++) {
            if (match.charAt(i) != seq.charAt(start + i)) {
                return false;
            }
        }
        return true;
    }
}
