package unverified;

public class ClonePair3361 {

    boolean method1(int[] a1,int[] a2){
      if (a1 == a2) {
        return true;
      }
     else   if (a1 == null || a2 == null) {
        return false;
      }
     else   if (a1.length != a2.length) {
        return false;
      }
     else {
        for (int i=0; i < a1.length; i++) {
          if (a1[i] != a2[i]) {
            return false;
          }
        }
        return true;
      }
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
