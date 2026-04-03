package equivalent;

public class ClonePair5448 {
    int[] method1(int[] ind, int sub) {
        int[] new_ind = new int[ind.length - 1];
        if (sub == 0) {
            System.arraycopy(ind, 1, new_ind, 0, ind.length - 1);
        } else if (sub == ind.length) {
            System.arraycopy(ind, 0, new_ind, 0, ind.length - 1);
        } else {
            if (sub >= 0) System.arraycopy(ind, 0, new_ind, 0, sub);
            if (ind.length - 1 - sub >= 0) System.arraycopy(ind, sub + 1, new_ind, sub, ind.length - 1 - sub);
        }
        return new_ind;
    }

    int[] method2(int[] ind, int sub) {
        int[] new_ind = new int[ind.length - 1];
        if (sub == 0) {
            System.arraycopy(ind, 1, new_ind, 0, ind.length - 1);
        } else if (sub == ind.length) {
            System.arraycopy(ind, 0, new_ind, 0, ind.length - 1);
        } else {
            if (sub >= 0) System.arraycopy(ind, 0, new_ind, 0, sub);
            if (ind.length - 1 - sub >= 0) System.arraycopy(ind, sub + 1, new_ind, sub, ind.length - 1 - sub);
        }
        return new_ind;
    }
}
