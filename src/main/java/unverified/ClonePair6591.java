package unverified;

public class ClonePair6591 {

    boolean method1(long[] a1,long[] a2){
      if (a1 == a2) {
        return true;
      }
      try {
        if (a1.length == a2.length) {
          for (int i=0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
              return false;
            }
          }
          return true;
        }
      }
     catch (  NullPointerException e) {
      }
      return false;
    }

    boolean method2(long[] a,long[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }
}
