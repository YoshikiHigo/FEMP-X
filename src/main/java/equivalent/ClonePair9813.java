package equivalent;

public class ClonePair9813 {
    String[] method1(String[] array, int length) {
        String[] newArray = new String[length];
        System.arraycopy(array, 0, newArray, 0, length);
        return newArray;
    }

    String[] method2(String[] array, int count) {
        String[] retval = new String[count];
        System.arraycopy(array, 0, retval, 0, count);
        return retval;
    }
}
