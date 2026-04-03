package equivalent;

public class ClonePair6608 {
    int method1(int val, int width) {
        if (val % width == 0) return val;
        return val + (width - (val % width));
    }

    int method2(int aSize, int aMinRecSize) {
        int pMod = aSize % aMinRecSize;
        if (pMod != 0) {
            return aSize + aMinRecSize - pMod;
        }
        return aSize;
    }
}
