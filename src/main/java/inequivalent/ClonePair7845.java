package inequivalent;

public class ClonePair7845 {

    int method1(int... array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int method2(int[] data) {
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] < min) min = data[i];
        }
        return min;
    }
}
