package inequivalent;

import java.util.Arrays;

public class ClonePair3137 {

    float method1(float[] array) {
        int med = 0;
        float[] tempArr = array;
        Arrays.sort(tempArr);
        int c = tempArr.length % 2;
        int pomHalf = c > 0 ? (Math.round((float) tempArr.length / 2) - 1) : Math.round((float) tempArr.length / 2);
        if ((c) == 0) {
            return (tempArr[pomHalf] + tempArr[pomHalf - 1]) / 2;
        } else {
            if (pomHalf >= tempArr.length) {
                System.out.println("Error in FeatureRanking.java in private float getMedian(float[] array)");
            }
            return tempArr[pomHalf];
        }
    }

    float method2(float[] array) {
        int numberOfItems;
        float returnValue;
        Arrays.sort(array);
        numberOfItems = array.length;
        if (numberOfItems % 2 == 1) {
            returnValue = array[numberOfItems / 2];
        } else {
            returnValue = array[numberOfItems / 2 - 1];
            returnValue += array[numberOfItems / 2];
            returnValue /= 2.0;
        }
        return returnValue;
    }
}
