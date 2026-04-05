package all;

public class ClonePair3566 {

    boolean method1(int[] a,int[] b){
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] a,int[] b){
      for (int i=0; i < a.length - 1; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
