package equivalent;

public class ClonePair6571 {
    float method1(float[] vec1, float[] vec2) {
        float result = 0;
        for (int i = 0; i < vec1.length; ++i) {
            result += vec1[i] * vec2[i];
        }
        return result;
    }

    float method2(float[] v1, float[] v2) {
        float result = 0.0f;
        for (int i = 0; i < v1.length; i++) {
            result += v1[i] * v2[i];
        }
        return (result);
    }
}
