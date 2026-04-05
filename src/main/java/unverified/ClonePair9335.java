package unverified;

public class ClonePair9335 {

    int method1(int[] values){
      int largestvalue=values[0];
      for (int i=1; i < values.length; i++)   if (values[i] > largestvalue)   largestvalue=values[i];
      return largestvalue;
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
