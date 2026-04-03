package inequivalent;

public class ClonePair4643 {

    double method1(double[] array) {
        double mean = 0;
        double sumX = array[0];
        for (int i = 1; i < array.length; i++) sumX += array[i];
        mean = sumX / array.length;
        return mean;
    }

    double method2(double[] A) {
        double avgGuess = A[0];
        double sum = 0.;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] - avgGuess;
        }
        return sum / A.length + avgGuess;
    }
}
