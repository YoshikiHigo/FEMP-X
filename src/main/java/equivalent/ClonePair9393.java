package equivalent;

public class ClonePair9393 {
    int[] method1(int[] qube, int off, int len) {
        int[] result = new int[len];
        System.arraycopy(qube, 0 + off, result, 0, len);
        return result;
    }

    int[] method2(int[] source, int pos, int length) {
        int[] dest = new int[length];
        System.arraycopy(source, pos + 0, dest, 0, length);
        return dest;
    }
}
