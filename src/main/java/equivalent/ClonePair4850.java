package equivalent;

public class ClonePair4850 {
    double method1(double[] array) {
        int len = array.length;
        int best = 0;
        double max = array[0];
        for (int i = 1; i < len; i++) {
            if (array[i] > max) {
                best = i;
                max = array[i];
            }
        }
        return max;
    }

    double method2(double[] data) {
        double answer = data[0];
        for (int i = 1; i < data.length; i++) {
            double alt = data[i];
            if (alt > answer) {
                answer = alt;
            }
        }
        return answer;
    }
}
