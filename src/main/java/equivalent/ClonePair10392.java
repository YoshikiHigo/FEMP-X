package equivalent;

public class ClonePair10392 {
    boolean method1(CharSequence seq, CharSequence... any) {
        if (seq.length() > 0) {
            for (int i = 0; i < any.length; i++) {
                if (seq.length() >= any[i].length())
                    if (seq.subSequence(0, any[i].length()).equals(any[i])) return true;
            }
        }
        return false;
    }

    boolean method2(CharSequence seq, CharSequence... any) {
        for (int i = 0; i < seq.length(); i++) {
            for (int j = 0; j < any.length; j++) {
                if (seq.length() >= any[j].length()) {
                    if (seq.subSequence(0, any[j].length()).equals(any[j])) return true;
                }
            }
        }
        return false;
    }
}
