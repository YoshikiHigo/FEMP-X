package equivalent;

public class ClonePair4625 {
    double method1(double[] data) {
        double answer = data[0];
        for (int i = 1; i < data.length; i++) {
            double alt = data[i];
            if (alt < answer) {
                answer = alt;
            }
        }
        return answer;
    }

    double method2(double[] v) {
        double min = v[0];
        for (int i = 1; i < v.length; i++) {
            if (min > v[i]) {
                min = v[i];
            }
        }
        return (min);
    }
}
