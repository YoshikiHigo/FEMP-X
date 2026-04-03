package equivalent;

public class ClonePair12596 {
    double[][] method1(double[][] values, int size) {
        for (int i = 0; i < size; i++) {
            if (values[i][i] == 0) {
                boolean found = false;
                for (int j = 0; j < size; j++) {
                    if (values[j][i] != 0 && values[i][j] != 0) {
                        double[] temp = values[i];
                        values[i] = values[j];
                        values[j] = temp;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    double[] temp = values[i];
                    values[i] = values[size - 1];
                    values[size - 1] = temp;
                }
            }
        }
        return values;
    }

    double[][] method2(double[][] values, int size) {
        for (int i = size - 1; i >= 0; i--) {
            if (values[i][i] == 0) {
                boolean found = false;
                for (int j = size - 1; j >= 0; j--) {
                    if (values[j][i] != 0 && values[i][j] != 0) {
                        double[] temp = values[i];
                        values[i] = values[j];
                        values[j] = temp;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    double[] temp = values[i];
                    values[i] = values[0];
                    values[0] = temp;
                }
            }
        }
        return values;
    }
}
