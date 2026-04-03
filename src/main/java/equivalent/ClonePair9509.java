package equivalent;

public class ClonePair9509 {
    int method1(int[] qianArray) {
        int max = qianArray[0];
        for (int i = 1; i < qianArray.length; i++) {
            if (max < qianArray[i]) {
                max = qianArray[i];
            }
        }
        return max;
    }

    int method2(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; ++i) if (numbers[i] > max) max = numbers[i];
        return max;
    }
}
