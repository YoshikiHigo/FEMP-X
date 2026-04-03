package equivalent;

public class ClonePair5161 {
    boolean method1(double[] array1, double[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }

    boolean method2(double[] lastLambda, double[] lambda) {
        for (int i = 0; i < lastLambda.length; i++) if (lastLambda[i] != lambda[i]) return false;
        return true;
    }
}
