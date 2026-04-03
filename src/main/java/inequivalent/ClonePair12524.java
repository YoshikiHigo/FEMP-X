package inequivalent;

public class ClonePair12524 {

    int method1(String string, char[] chars, int startPos) {
        int min = -1;
        for (int i = 0; i < chars.length; i++) {
            int index = string.indexOf(chars[i], startPos);
            if (index != -1 && (min == -1 || index < min)) min = index;
        }
        return min;
    }

    int method2(String hayStack, char[] needles, int fromIndex) {
        int smallest = Integer.MAX_VALUE;
        int index;
        for (int i = 0; i < needles.length; i++) {
            index = hayStack.indexOf(needles[i], fromIndex);
            if (index < smallest && index > -1) {
                smallest = index;
            }
        }
        if (smallest < Integer.MAX_VALUE) {
            return smallest;
        }
        return -1;
    }
}
