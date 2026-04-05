package all;

import java.util.Arrays;

public class ClonePair3138 {

    float method1(float[] array){
      int med=0;
      float[] tempArr=array;
      Arrays.sort(tempArr);
      int c=tempArr.length % 2;
      int pomHalf=c > 0 ? (Math.round((float)tempArr.length / 2) - 1) : Math.round((float)tempArr.length / 2);
      if ((c) == 0) {
        return (tempArr[pomHalf] + tempArr[pomHalf - 1]) / 2;
      }
     else {
        if (pomHalf >= tempArr.length) {
          System.out.println("Error in FeatureRanking.java in private float getMedian(float[] array)");
        }
        return tempArr[pomHalf];
      }
    }

    float method2(float[] array){
      float med=0;
      int index=0;
      Arrays.sort(array);
      if ((float)array.length / 2 - (int)array.length / 2 == 0) {
        index=((int)array.length / 2) - 1;
        med=(array[index] + array[index + 1]) / 2;
      }
     else {
        index=((int)(array.length + 1) / 2) - 1;
        med=array[index];
      }
      return med;
    }
}
