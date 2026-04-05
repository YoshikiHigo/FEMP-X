package unverified;

public class ClonePair3532 {

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
