package unverified;

public class ClonePair9426 {

    int method1(int[] values){
      int result=values[0];
      for (  int i : values)   if (i > result)   result=i;
      return result;
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
