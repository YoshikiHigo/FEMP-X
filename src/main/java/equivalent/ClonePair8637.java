package equivalent;

public class ClonePair8637 {
    int method1(char[] buffer, int start, char c) {
        for (int i = start; i < buffer.length; i++) if (buffer[i] == c) return i;
        return -1;
    }

    int method2(char[] source, int index, char match) {
        for (int i = index; i < source.length; i++) {
            if (source[i] == match) {
                return i;
            }
        }
        return -1;
    }
}
