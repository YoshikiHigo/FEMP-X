package unverified;

public class ClonePair9530 {

    boolean method1(int[] a){
      for (int i=1; i < a.length; i++) {
        if (a[i] <= a[i - 1]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] array){
      boolean sorted=true;
      for (int i=0; i < array.length - 1 && sorted; ++i) {
        sorted=array[i] < array[i + 1];
      }
      return sorted;
    }
}
