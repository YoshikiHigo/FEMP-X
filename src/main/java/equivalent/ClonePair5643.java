package equivalent;

public class ClonePair5643 {
    boolean method1(String word, boolean startsSentance) {
        int strLen = word.length();
        boolean isUpper = Character.isUpperCase(word.charAt(0));
        if ((startsSentance) && isUpper && (strLen > 1)) isUpper = Character.isUpperCase(word.charAt(1));
        if (isUpper) {
            for (int i = word.length() - 1; i > 0; i--) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return true;
                }
            }
        } else {
            for (int i = word.length() - 1; i > 0; i--) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean method2(String word, boolean sentence) {
        final int length = word.length();
        boolean upper = Character.isUpperCase(word.charAt(0));
        if (sentence && upper && (length > 1)) upper = Character.isUpperCase(word.charAt(1));
        if (upper) {
            for (int index = length - 1; index > 0; index--) {
                if (Character.isLowerCase(word.charAt(index))) return true;
            }
        } else {
            for (int index = length - 1; index > 0; index--) {
                if (Character.isUpperCase(word.charAt(index))) return true;
            }
        }
        return false;
    }
}
