package inequivalent;

public class ClonePair5445 {

    int[] method1(int[] targ, int size) {
        int[] na;
        int i;
        na = new int[size];
        for (i = 0; i < targ.length; i++) na[i] = targ[i];
        while (i < na.length) {
            na[i] = targ[targ.length - 1];
            i++;
        }
        return na;
    }

    int[] method2(int[] x, int n) {
        int[] S = new int[n];
        for (int i = 0; i < x.length; i++) {
            int s = 1;
            while ((s <= i) && (x[i - s] <= x[i])) {
                s = s + 1;
            }
            S[i] = s;
        }
        return S;
    }
}
