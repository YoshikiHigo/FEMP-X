package inequivalent;

public class ClonePair8408 {

    int[] method1(int[] op, int lr, int al, int count) {
        int len = op.length;
        int[] res = new int[len];
        if (lr == 0) {
            if (al == 0) {
                for (int i = 0; i < count; i++) {
                    if (len - 1 - 1 >= 0) System.arraycopy(op, 2, res, 1, len - 1 - 1);
                    res[1] = 0;
                }
            } else {
                for (int i = 0; i < count; i++) {
                    if (len - 1 >= 0) System.arraycopy(op, 1, res, 0, len - 1);
                    res[0] = 0;
                }
            }
        } else {
            if (al == 0) {
                for (int i = 0; i < count; i++) {
                    if (len - 1 - 1 >= 0) System.arraycopy(op, 2, res, 1, len - 1 - 1);
                    res[len - 1] = 0;
                }
            } else {
                for (int i = 0; i < count; i++) {
                    if (len - 1 >= 0) System.arraycopy(op, 1, res, 0, len - 1);
                    res[len - 1] = 0;
                }
            }
        }
        return res;
    }

    int[] method2(int[] op, int lr, int al, int count) {
        int tmp = 0;
        int len = op.length;
        int[] res = new int[len];
        if (lr == 0) {
            if (al == 0) {
                for (int i = 0; i < count; i++) {
                    tmp = op[len - 1];
                    if (len - 1 - 1 >= 0) System.arraycopy(op, 2, res, 1, len - 1 - 1);
                    res[1] = tmp;
                }
            } else {
                for (int i = 0; i < count; i++) {
                    tmp = op[len - 1];
                    System.arraycopy(op, 1, res, 0, len - 1);
                    res[0] = tmp;
                }
            }
        } else {
            if (al == 0) {
                for (int i = 0; i < count; i++) {
                    tmp = op[1];
                    System.arraycopy(op, 2, res, 1, len - 1 - 1);
                    res[len - 1] = tmp;
                }
            } else {
                for (int i = 0; i < count; i++) {
                    tmp = op[0];
                    System.arraycopy(op, 1, res, 0, len - 1);
                    res[len - 1] = tmp;
                }
            }
        }
        return res;
    }
}
