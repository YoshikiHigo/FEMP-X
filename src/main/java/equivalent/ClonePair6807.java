package equivalent;

public class ClonePair6807 {
    int method1(int i1, int i2, int i3) {
        int max = i1;
        if (i2 > i1) {
            max = i2;
        }
        if (i3 > max) {
            max = i3;
        }
        return max;
    }

    int method2(int x, int y, int z) {
        if (x > y) if (x > z) return x;
        else return z;
        else if (y > z) return y;
        else return z;
    }
}
