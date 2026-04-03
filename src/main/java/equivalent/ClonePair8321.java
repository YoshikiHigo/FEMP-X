package equivalent;

public class ClonePair8321 {
    double[] method1(double[] vec1, double[] vec2) {
        if (vec1.length != vec2.length) {
            return null;
        } else {
            double[] result = new double[vec1.length];
            for (int i = 0; i < vec1.length; i++) {
                result[i] = vec1[i] + vec2[i];
            }
            return result;
        }
    }

    double[] method2(double[] array1, double[] array2) {
        if (array1.length != array2.length) {
            return null;
        }
        double[] newArray = new double[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] + array2[i];
        }
        return newArray;
    }
}
