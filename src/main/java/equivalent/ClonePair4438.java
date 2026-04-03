package equivalent;

public class ClonePair4438 {
    double method1(double[] vector) {
        double sum = 0, sumSquared = 0;
        if (vector.length <= 1) {
            return 0;
        }
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
            sumSquared += (vector[i] * vector[i]);
        }
        double result = (sumSquared - (sum * sum / (double) vector.length)) / (double) (vector.length - 1);
        if (result < 0) {
            return 0;
        } else {
            return result;
        }
    }

    double method2(double[] vector) {
        double sum = 0;
        double sumSquared = 0;
        if (vector.length <= 1) {
            return 0;
        }
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
            sumSquared += (vector[i] * vector[i]);
        }
        double result = (sumSquared - ((sum * sum) / (double) vector.length)) / (double) (vector.length - 1);
        if (result < 0) {
            return 0;
        } else {
            return result;
        }
    }
}
