package equivalent;

public class ClonePair5094 {
    boolean method1(int a, int b, int i, int j) {
        if (i >= a && i <= b) return true;
        if (j >= a && j <= b) return true;
        if (a >= i && a <= j) return true;
        return b >= i && b <= j;
    }

    boolean method2(int a1, int a2, int b1, int b2) {
        if ((a1 >= b1 && a1 <= b2) || (a2 >= b1 && a2 <= b2)) {
            return true;
        }
        return (b1 >= a1 && b1 <= a2) || (b2 >= a1 && b2 <= a2);
    }
}
