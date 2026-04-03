package equivalent;

public class ClonePair6919 {
    int method1(int a, int b, int c) {
        if (b > a) {
            a = b;
        }
        if (c > a) {
            a = c;
        }
        return a;
    }

    int method2(int a1, int a2, int a3) {
        if (a1 >= a2 && a1 >= a3) {
            return a1;
        } else if (a2 >= a1 && a2 >= a3) {
            return a2;
        } else return a3;
    }
}
