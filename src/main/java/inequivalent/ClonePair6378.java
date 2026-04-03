package inequivalent;

public class ClonePair6378 {

    int method1(int[] o1, int[] o2) {
        if (o1.length != o2.length) {
            if (o1.length > o2.length) {
                return 1;
            } else {
                return -1;
            }
        }
        for (int dim = 0; dim < o1.length; dim++) {
            if (o1[dim] < o2[dim]) {
                return -1;
            } else if (o1[dim] > o2[dim]) {
                return 1;
            }
        }
        return 0;
    }

    int method2(int[] a, int[] b) {
        int alen = a.length;
        int blen = b.length;
        for (int i = 0; i < alen; ++i) {
            if (i == blen) return 1;
            else if (a[i] > b[i]) return 1;
            else if (a[i] < b[i]) return -1;
        }
        if (blen > alen) return -1;
        else return 0;
    }
}
