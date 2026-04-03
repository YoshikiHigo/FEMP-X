package equivalent;

public class ClonePair1050 {
    int method1(Object[] list, Object file) {
        if (file == null) {
            return -1;
        }
        for (int i = 0; i < list.length; i++) {
            if (file.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    int method2(Object[] array, Object key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].equals(key)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
