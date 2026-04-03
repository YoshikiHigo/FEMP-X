package equivalent;

public class ClonePair4712 {
    double method1(double[] a) {
        double res = a[0];
        double buff;
        for (int i = 1; i < a.length; i++) {
            buff = a[i];
            if (buff > res) {
                res = buff;
            }
        }
        return res;
    }

    double method2(double[] numbers) {
        int maxIdx = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIdx]) {
                maxIdx = i;
            }
        }
        return numbers[maxIdx];
    }
}
