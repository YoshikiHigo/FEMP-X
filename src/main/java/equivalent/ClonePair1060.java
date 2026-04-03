package equivalent;

public class ClonePair1060 {
    int method1(Object[] array, Object object) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == object) {
                return i;
            }
            if (object != null && object.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    int method2(Object[] array, Object value) {
        for (int i = 0; i < array.length; i++)
            if (value != null) {
                if (value.equals(array[i])) return i;
            } else {
                if (array[i] == null) return i;
            }
        return -1;
    }
}
