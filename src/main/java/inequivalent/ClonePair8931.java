package inequivalent;

public class ClonePair8931 {

    boolean method1(String text, String suffix) {
        int length = suffix.length();
        int offset = text.length() - length;
        if (offset < 0) return false;
        for (int i = 0; i < length; i++) {
            char tc = Character.toLowerCase(text.charAt(offset + i));
            char pc = Character.toLowerCase(suffix.charAt(i));
            if (tc != pc) return false;
        }
        return true;
    }

    boolean method2(String text, String prefix) {
        int length = prefix.length();
        if (length > text.length()) return false;
        for (int i = 0; i < length; i++) {
            char tc = Character.toLowerCase(text.charAt(i));
            char pc = Character.toLowerCase(prefix.charAt(i));
            if (tc != pc) return false;
        }
        return true;
    }
}
