package equivalent;

public class ClonePair13391 {
    boolean method1(String[] candidates, char[] token, int offset, int length) {
        if ((offset < 0) || (offset >= token.length) || (candidates.length == 0)) {
            return false;
        }
        final String checkable = new String(token, offset, length);
        for (int index = 0; index < candidates.length; index++) {
            if (candidates[index].equals(checkable)) {
                return true;
            }
        }
        return false;
    }

    boolean method2(String[] candidates, char[] token, int offset, int length) {
        if (offset < 0 || offset >= token.length || candidates.length == 0) return false;
        final String checkable = new String(token, offset, length);
        for (int index = 0; index < candidates.length; index++) {
            if (candidates[index].equals(checkable)) return true;
        }
        return false;
    }
}
