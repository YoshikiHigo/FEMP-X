package unverified;

public class ClonePair6598 {

    boolean method1(long[] a1,long[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] != a2[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(long[] a,long[] b){
      if (a == null) {
        return b == null;
      }
      if (b == null) {
        return false;
      }
      if (a.length != b.length) {
        return false;
      }
      for (int i=a.length - 1; i >= 0; i--) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
