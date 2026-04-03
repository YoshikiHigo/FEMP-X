package inequivalent;

public class ClonePair5920 {

    int method1(int one, int two) {
        if (one < 0 && two < 0) return -1;
        if (one < 0) return two;
        if (two < 0) return one;
        return Math.min(one, two);
    }

    int method2(int i1, int i2) {
        if (i1 < 0) return i2;
        if (i2 < 0) return i1;
        if (i1 > i2) return i2;
        return i1;
    }
}
