package unverified;

public class ClonePair9332 {

    int method1(int[] values){
      int largestvalue=values[0];
      for (int i=1; i < values.length; i++)   if (values[i] > largestvalue)   largestvalue=values[i];
      return largestvalue;
    }

    int method2(int[] v){
      int max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
    }
}
