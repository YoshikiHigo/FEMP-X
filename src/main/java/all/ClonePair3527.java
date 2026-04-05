package all;

public class ClonePair3527 {

    boolean method1(int[] orig,int[] dest){
      for (int i=0; i < orig.length; i++)   if (orig[i] != dest[i])   return false;
      return true;
    }

    boolean method2(int[] a,int[] b){
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
