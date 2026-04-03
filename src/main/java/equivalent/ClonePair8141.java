package equivalent;

public class ClonePair8141 {
    float method1(float[] row, float[] col, int size) {
        float result = 0;
        for (int i = 0; i < size; i++) result += row[i] * col[i];
        return result;
    }

    float method2(float[] row, float[] col, int size) {
        float result = 0.0f;
        for (int i = 0; i < size; i++) {
            result += row[i] * col[i];
        }
        return result;
    }
}
