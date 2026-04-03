package equivalent;

public class ClonePair9486 {
    int method1(int[] histogram) {
        int level;
        int maxValue = histogram.length - 1;
        double result, sum1, sum2, sum3, sum4;
        int count0 = histogram[0];
        histogram[0] = 0;
        int countMax = histogram[maxValue];
        histogram[maxValue] = 0;
        int min = 0;
        while ((histogram[min] == 0) && (min < maxValue)) min++;
        int max = maxValue;
        while ((histogram[max] == 0) && (max > 0)) max--;
        if (min >= max) {
            histogram[0] = count0;
            histogram[maxValue] = countMax;
            level = histogram.length / 2;
            return level;
        }
        int movingIndex = min;
        do {
            sum1 = sum2 = sum3 = sum4 = 0.0;
            for (int i = min; i <= movingIndex; i++) {
                sum1 += i * histogram[i];
                sum2 += histogram[i];
            }
            for (int i = (movingIndex + 1); i <= max; i++) {
                sum3 += i * histogram[i];
                sum4 += histogram[i];
            }
            result = (sum1 / sum2 + sum3 / sum4) / 2.0;
            movingIndex++;
        }
        while ((movingIndex + 1) <= result && movingIndex < max - 1);
        histogram[0] = count0;
        histogram[maxValue] = countMax;
        level = (int) Math.round(result);
        return level;
    }

    int method2(int[] data) {
        int level;
        int maxValue = data.length - 1;
        double result, sum1, sum2, sum3, sum4;
        int count0 = data[0];
        data[0] = 0;
        int countMax = data[maxValue];
        data[maxValue] = 0;
        int min = 0;
        while ((data[min] == 0) && (min < maxValue)) min++;
        int max = maxValue;
        while ((data[max] == 0) && (max > 0)) max--;
        if (min >= max) {
            data[0] = count0;
            data[maxValue] = countMax;
            level = data.length / 2;
            return level;
        }
        int movingIndex = min;
        int inc = Math.max(max / 40, 1);
        do {
            sum1 = sum2 = sum3 = sum4 = 0.0;
            for (int i = min; i <= movingIndex; i++) {
                sum1 += i * data[i];
                sum2 += data[i];
            }
            for (int i = (movingIndex + 1); i <= max; i++) {
                sum3 += i * data[i];
                sum4 += data[i];
            }
            result = (sum1 / sum2 + sum3 / sum4) / 2.0;
            movingIndex++;
        }
        while ((movingIndex + 1) <= result && movingIndex < max - 1);
        data[0] = count0;
        data[maxValue] = countMax;
        level = (int) Math.round(result);
        return level;
    }
}
