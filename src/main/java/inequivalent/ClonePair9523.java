package inequivalent;

public class ClonePair9523 {

    boolean method1(int[] values) {
        for (int i = 1; i < values.length; i++) {
            if (values[i - 1] <= values[i]) return false;
        }
        return true;
    }

    boolean method2(int[] positions) {
        for (int i = 0; i < positions.length; i++) {
            for (int j = i + 1; j < positions.length; j++) {
                if (positions[i] == positions[j] || positions[i] - i == positions[j] - j || positions[i] + i == positions[j] + j)
                    return false;
            }
        }
        return true;
    }
}
