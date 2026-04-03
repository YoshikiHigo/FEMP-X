package inequivalent;

public class ClonePair8756 {

    float[] method1(float[] array, int start) {
        int nl = array.length - start;
        float[] ret = new float[nl];
        if (array.length - start >= 0) System.arraycopy(array, start, ret, start - start, array.length - start);
        return ret;
    }

    float[] method2(float[] v, int start) {
        float[] r = new float[v.length - start];
        if (r.length - start >= 0) System.arraycopy(v, start, r, start - start, r.length - start);
        return r;
    }
}
