package inequivalent;

public class ClonePair9556 {

    int method1(double[] vector) {
        int result = -1;
        double max = -Double.MAX_VALUE;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v: " + vector[i] + " max: " + max);
            if (vector[i] > max) {
                max = vector[i];
                result = i;
                System.out.println(">" + result);
            }
        }
        return result;
    }

    int method2(double[] array) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if ((result == -1) || (array[result] < array[i])) {
                result = i;
            }
        }
        return result;
    }
}
