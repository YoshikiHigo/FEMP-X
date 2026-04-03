package equivalent;

public class ClonePair7067 {
    int method1(int theInt, int minValue, int maxValue) {
        int rangeInt = theInt;
        if (rangeInt < minValue) {
            rangeInt = minValue;
        } else if (rangeInt > maxValue) {
            rangeInt = maxValue;
        }
        return rangeInt;
    }

    int method2(int value, int lower, int upper) {
        if (value < lower) value = lower;
        else if (value > upper) value = upper;
        return value;
    }
}
