package equivalent;

public class ClonePair12182 {
    int method1(byte[] input, int start1, byte[] fragment) {
        int fragmentIndex = 0;
        while (start1 < input.length && fragmentIndex < fragment.length && input[start1++] == fragment[fragmentIndex]) {
            fragmentIndex++;
        }
        return fragmentIndex;
    }

    int method2(byte[] arra, int start, byte[] arrb) {
        int k = 0;
        int limit = arra.length - start;
        if (limit > arrb.length) {
            limit = arrb.length;
        }
        for (int i = 0; i < limit; i++) {
            if (arra[i + start] == arrb[i]) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }
}
