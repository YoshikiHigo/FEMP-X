package unverified;

public class ClonePair9373 {

    int method1(int[] array){
      int max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max) {
          max=array[i];
        }
      }
      return max;
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
