package all;

public class ClonePair9328 {

    int method1(int[] values){
      int largestvalue=values[0];
      for (int i=1; i < values.length; i++)   if (values[i] > largestvalue)   largestvalue=values[i];
      return largestvalue;
    }

    int method2(int[] qianArray){
      int max=qianArray[0];
      for (int i=1; i < qianArray.length; i++) {
        if (max < qianArray[i]) {
          max=qianArray[i];
        }
      }
      return max;
    }
}
