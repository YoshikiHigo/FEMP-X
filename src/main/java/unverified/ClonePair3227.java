package unverified;

public class ClonePair3227 {

    boolean method1(int[] a,int[] b){
      if (a.length != b.length) {
        return (false);
      }
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return (false);
        }
      }
      return (true);
    }

    boolean method2(int[] a1,int[] a2){
      if (a1.length != a2.length) {
        return false;
      }
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
