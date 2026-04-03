package equivalent;

public class ClonePair7979 {
    int method1(int a, int b) {
        if (a >= 0 && b >= 0) {
            return (a < b) ? a : b;
        } else if (a >= 0) {
            return a;
        } else if (b >= 0) {
            return b;
        } else {
            return -1;
        }
    }

    int method2(int nEnd1, int nEnd2) {
        if (nEnd1 >= 0 && nEnd2 >= 0) {
            if (nEnd1 < nEnd2) return nEnd1;
            return nEnd2;
        }
        if (nEnd1 >= 0) return nEnd1;
        if (nEnd2 >= 0) return nEnd2;
        return -1;
    }
}
