package equivalent;

public class ClonePair7689 {
    int method1(char[] a, int startA, char[] b, int startB) {
        for (; a[startA] == b[startB]; startA++, startB++) {
            if (a[startA] == 0) {
                return 0;
            }
        }
        return a[startA] - b[startB];
    }

    int method2(char[] a, int startA, char[] b, int startB) {
        for (; a[startA] == b[startB]; startA++, startB++) if (a[startA] == 0) return 0;
        return a[startA] - b[startB];
    }
}
