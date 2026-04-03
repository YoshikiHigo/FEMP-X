package inequivalent;

public class ClonePair5885 {

    int method1(int[] index, int key, int begin, int end) {
        end--;
        while (begin <= end) {
            int mid = (end + begin) >>> 1;
            if (index[mid] < key) begin = mid + 1;
            else if (index[mid] > key) end = mid - 1;
            else return mid;
        }
        return -begin - 1;
    }

    int method2(int[] array, int value, int fromIndex, int toIndex) {
        while (fromIndex < toIndex) {
            int i;
            int nv;
            if ((nv = array[i = (fromIndex + toIndex) >> 1]) < value) {
                fromIndex = i + 1;
            } else if (nv > value) {
                toIndex = i;
            } else {
                return i;
            }
        }
        return ~fromIndex;
    }
}
