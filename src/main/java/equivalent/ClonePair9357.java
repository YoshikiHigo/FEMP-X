package equivalent;

public class ClonePair9357 {
    int method1(int[] sn) {
        int result = sn[0];
        for (int i = 0; i < sn.length; i++) {
            if (result < sn[i]) result = sn[i];
        }
        return result;
    }

    int method2(int[] values) {
        int result = values[0];
        for (int i : values) if (i > result) result = i;
        return result;
    }
}
