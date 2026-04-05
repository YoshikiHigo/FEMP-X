package unverified;

public class ClonePair3534 {

    boolean method1(int[] s0,int[] s1){
      if (s0 == null || s1 == null) {
        return false;
      }
      if (s0.length != s1.length) {
        return false;
      }
      for (int i=0; i < s0.length; i++) {
        if (s0[i] != s1[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(int[] a,int[] b){
      if (a == b)   return true;
      if (a == null || b == null)   return false;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++)   if (a[i] != b[i])   return false;
      return true;
    }
}
