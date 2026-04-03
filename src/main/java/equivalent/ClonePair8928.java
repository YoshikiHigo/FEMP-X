package equivalent;

public class ClonePair8928 {
    int method1(int[] array, int length, int value) {
        int lowIndex = 0;
        int highIndex = length - 1;
        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) >>> 1;
            int midValue = array[midIndex];
            if (midValue > value) {
                highIndex = midIndex - 1;
            } else if (midValue < value) {
                lowIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }
        return -lowIndex - 1;
    }

    int method2(int[] array, int toIndex, int key) {
        int low = 0;
        int high = toIndex - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];
            if (midVal < key) low = mid + 1;
            else if (midVal > key) high = mid - 1;
            else return mid;
        }
        return -(low + 1);
    }
}
