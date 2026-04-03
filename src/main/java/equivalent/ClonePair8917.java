package equivalent;

public class ClonePair8917 {
    int method1(float[] vec) {
        float prev = vec[0];
        int index = 0;
        for (int i = 1; i < vec.length; i++) {
            if (prev > vec[i]) {
                prev = vec[i];
                index = i;
            }
        }
        return index;
    }

    int method2(float[] data) {
        float min = data[0];
        int index = 0;
        for (int i = 1; i < data.length; ++i) if (data[i] < min) min = data[index = i];
        return index;
    }
}
