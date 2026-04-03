package inequivalent;

public class ClonePair78 {

    int method1(char[] source, int sourceOffset, int sourceCount, char[] target, int targetOffset, int targetCount, int fromIndex) {
        if (fromIndex >= sourceCount) {
            return (targetCount == 0 ? sourceCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (targetCount == 0) {
            return fromIndex;
        }
        char first = target[targetOffset];
        int max = sourceOffset + (sourceCount - targetCount);
        for (int i = sourceOffset + fromIndex; i <= max; i++) {
            if (source[i] != first) {
                while (++i <= max && source[i] != first) {
                }
            }
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = targetOffset + 1; j < end && source[j] == target[k]; j++, k++) {
                }
                if (j == end) {
                    return i - sourceOffset;
                }
            }
        }
        return -1;
    }

    int method2(char[] source, int sourceOffset, int sourceCount, char[] target, int targetOffset, int targetCount, int fromIndex) {
        if (fromIndex >= sourceCount) {
            return (targetCount == 0 ? sourceCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (targetCount == 0) {
            return fromIndex;
        }
        char first = Character.toLowerCase(target[targetOffset]);
        int max = sourceOffset + (sourceCount - targetCount);
        for (int i = sourceOffset + fromIndex; i <= max; i++) {
            if (Character.toLowerCase(source[i]) != Character.toLowerCase(first)) {
                while (++i <= max && Character.toLowerCase(source[i]) != first) ;
            }
            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = targetOffset + 1; j < end && Character.toLowerCase(source[j]) == Character.toLowerCase(target[k]); j++, k++)
                    ;
                if (j == end) {
                    return i - sourceOffset;
                }
            }
        }
        return -1;
    }
}
