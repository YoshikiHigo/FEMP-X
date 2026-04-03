package inequivalent;

public class ClonePair3547 {

    double[] method1(double[][] front, int noObjectives) {
        double[] maximumValue = new double[noObjectives];
        for (int i = 0; i < noObjectives; i++) maximumValue[i] = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < front.length; i++) {
            for (int j = 0; j < front[i].length; j++) {
                if (front[i][j] > maximumValue[j]) maximumValue[j] = front[i][j];
            }
        }
        return maximumValue;
    }

    double[] method2(double[][] front, int noObjectives) {
        double[] minimumValue = new double[noObjectives];
        for (int i = 0; i < noObjectives; i++) minimumValue[i] = Double.MAX_VALUE;
        for (int i = 0; i < front.length; i++) {
            for (int j = 0; j < front[i].length; j++) {
                if (front[i][j] < minimumValue[j]) minimumValue[j] = front[i][j];
            }
        }
        return minimumValue;
    }
}
