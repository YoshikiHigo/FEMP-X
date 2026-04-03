package equivalent;

import java.util.ArrayList;

public class ClonePair6006 {
    boolean method1(ArrayList<Double> data, ArrayList<Double> classes) {
        boolean isDivisible;
        int nPoints;
        double firstClass;
        int numInstances;
        numInstances = data.size();
        isDivisible = false;
        firstClass = classes.get(0);
        for (nPoints = 1; nPoints < numInstances; nPoints++) {
            if (firstClass != classes.get(nPoints) && !isDivisible) {
                isDivisible = true;
            }
        }
        return isDivisible;
    }

    boolean method2(ArrayList<Double> data, ArrayList<Double> classes) {
        boolean isDivisible;
        int nPoints;
        int size;
        double firstClass;
        isDivisible = false;
        size = data.size();
        firstClass = classes.get(0);
        for (nPoints = 1; nPoints < size; nPoints++) {
            if (firstClass != classes.get(nPoints) && !isDivisible) {
                isDivisible = true;
            }
        }
        return isDivisible;
    }
}
