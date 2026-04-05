package unverified;

public class ClonePair9516 {

    int method1(int[] qianArray){
      int max=qianArray[0];
      for (int i=1; i < qianArray.length; i++) {
        if (max < qianArray[i]) {
          max=qianArray[i];
        }
      }
      return max;
    }

    int method2(int[] values){
      int max=values[0];
      for (  int value : values) {
        if (value > max) {
          max=value;
        }
      }
      return max;
    }
}
