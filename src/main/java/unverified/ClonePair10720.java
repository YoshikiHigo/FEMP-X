package unverified;

public class ClonePair10720 {

    int method1(int... array){
      int max=array[0];
      for (int i=1; i < array.length; i++) {
        if (array[i] > max) {
          max=array[i];
        }
      }
      return max;
    }

    int method2(int... values){
      int value=values[0];
      int len=values.length;
      for (int i=0; i < len; i++) {
        if (values[i] >= value)     value=values[i];
      }
      return value;
    }
}
