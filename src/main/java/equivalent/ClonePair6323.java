package equivalent;

public class ClonePair6323 {
    int method1(int[] index, int key, int begin, int end, boolean greater) {
        if (begin == end) if (greater) return end;
        else return begin - 1;
        end--;
        int mid = (end + begin) >> 1;
        while (begin <= end) {
            mid = (end + begin) >>> 1;
            if (index[mid] < key) begin = mid + 1;
            else if (index[mid] > key) end = mid - 1;
            else return mid;
        }
        if ((greater && index[mid] >= key) || (!greater && index[mid] <= key)) return mid;
        else if (greater) return mid + 1;
        else return mid - 1;
    }

    int method2(int[] index, int key, int begin, int end, boolean greater) {
        if (begin == end) if (greater) return end;
        else return begin - 1;
        end--;
        int mid = (end + begin) >> 1;
        while (begin <= end) {
            mid = (end + begin) >> 1;
            if (index[mid] < key) begin = mid + 1;
            else if (index[mid] > key) end = mid - 1;
            else return mid;
        }
        if ((greater && index[mid] >= key) || (!greater && index[mid] <= key)) return mid;
        else if (greater) return mid + 1;
        else return mid - 1;
    }
}
