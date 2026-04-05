package all;

public class ClonePair9533 {

    boolean method1(int[] a){
      for (int i=1; i < a.length; i++) {
        if (a[i] <= a[i - 1]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] rest){
      for (int i=1; i < rest.length; i++) {
        if (rest[i - 1] + 1 != rest[i]) {
          return false;
        }
      }
      return true;
    }
}
