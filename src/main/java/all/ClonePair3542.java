package all;

public class ClonePair3542 {

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

    boolean method2(int[] a,int[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }
}
