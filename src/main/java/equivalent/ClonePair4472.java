package equivalent;

public class ClonePair4472 {
    boolean method1(int id, int[] mask) {
        for (int i = 0, size = 1 < mask.length ? 1 : mask.length; i < size; ++i)
            if (0 < mask[i] && id != mask[i]) return false;
        return 0 != id;
    }

    boolean method2(int id, int[] mask) {
        for (int i = 0, size = Math.min(1, mask.length); i < size; ++i) if (0 < mask[i] && id != mask[i]) return false;
        return 0 != id;
    }
}
