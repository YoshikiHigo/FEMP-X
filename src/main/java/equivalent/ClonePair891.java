package equivalent;

public class ClonePair891 {
    double[] method1(double[] ary, int idx) {
        if (null == ary || 0 > idx) return ary;
        else {
            int len = ary.length;
            if (idx >= len) return ary;
            else if (0 == idx) {
                int nlen = (len - 1);
                double[] copy = new double[nlen];
                System.arraycopy(ary, 1, copy, 0, nlen);
                return copy;
            } else {
                int nlen = (len - 1);
                double[] copy = new double[nlen];
                System.arraycopy(ary, 0, copy, 0, (idx));
                System.arraycopy(ary, (idx + 1), copy, (idx), (nlen - idx));
                return copy;
            }
        }
    }

    double[] method2(double[] array, int index) {
        if (array == null) {
            return null;
        }
        if (index < 0 || index >= array.length) {
            return array;
        }
        double[] retVal = new double[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) {
                retVal[i] = array[i];
            } else if (i > index) {
                retVal[i - 1] = array[i];
            }
        }
        return retVal;
    }
}
