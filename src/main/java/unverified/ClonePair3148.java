package unverified;

import java.util.Arrays;

public class ClonePair3148 {

    float method1(float[] array){
      int numberOfItems;
      float returnValue;
      Arrays.sort(array);
      numberOfItems=array.length;
      if (numberOfItems % 2 == 1) {
        returnValue=array[numberOfItems / 2];
      }
     else {
        returnValue=array[numberOfItems / 2 - 1];
        returnValue+=array[numberOfItems / 2];
        returnValue/=2.0;
      }
      return returnValue;
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
