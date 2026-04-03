package equivalent;

public class ClonePair7667 {
    int method1(char c, char[] array, int start, int len) {
        for (int i = start; i < len; i++) if (array[i] == c) return i;
        return -1;
    }

    int method2(char lookFor, char[] buf, int startAt, int limit) {
        for (; startAt < limit; startAt++) {
            if (buf[startAt] == lookFor) return startAt;
        }
        return -1;
    }
}
