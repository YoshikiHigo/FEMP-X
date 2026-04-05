package unverified;

public class ClonePair9531 {

    boolean method1(int[] a){
      for (int i=1; i < a.length; i++) {
        if (a[i] <= a[i - 1]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] values){
      for (int i=1; i < values.length; i++) {
        if (values[i - 1] >= values[i])     return false;
      }
      return true;
    }
}
