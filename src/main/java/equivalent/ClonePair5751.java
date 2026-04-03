package equivalent;

public class ClonePair5751 {
    long[] method1(long[] array, int minCapacity) {
        int oldCapacity = array.length;
        long[] newArray;
        if (minCapacity > oldCapacity) {
            int newCapacity = (oldCapacity * 3) / 2 + 1;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            newArray = new long[newCapacity];
            System.arraycopy(array, 0, newArray, 0, oldCapacity);
        } else {
            newArray = array;
        }
        return newArray;
    }

    long[] method2(long[] array, int minCapacity) {
        int oldCapacity = array.length;
        if (minCapacity > oldCapacity) {
            long[] oldData = array;
            int newCapacity = (oldCapacity * 3) / 2 + 1;
            if (newCapacity < minCapacity) newCapacity = minCapacity;
            long[] copy = new long[newCapacity];
            System.arraycopy(array, 0, copy, 0, Math.min(oldData.length, newCapacity));
            return copy;
        }
        return array;
    }
}
