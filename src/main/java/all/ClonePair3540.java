package all;

public class ClonePair3540 {

    boolean method1(int[] a,int[] b){
      if (a == null) {
        if (b != null) {
          return false;
        }
      }
     else {
        if (b == null) {
          return false;
        }
        if (a.length != b.length) {
          return false;
        }
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            return false;
          }
        }
      }
      return true;
    }

    boolean method2(int[] a1,int[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
    }
}
