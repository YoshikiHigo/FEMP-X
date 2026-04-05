package all;

public class ClonePair6058 {

    boolean method1(Object[] ar1,Object[] ar2){
      if (ar1 == null && ar2 == null)   return true;
      if (ar1 == null || ar2 == null)   return false;
      if (ar1.length != ar2.length)   return false;
      for (int i=0; i < ar1.length; i++) {
        if (ar1[i] == null) {
          if (ar2[i] == null)       continue;
          return false;
        }
     else     if (ar2[i] == null)     return false;
        if (!ar1[i].equals(ar2[i]))     return false;
      }
      return true;
    }

    boolean method2(Object[] a,Object[] a2){
      if (a == a2) {
        return true;
      }
      if (a == null || a2 == null) {
        return false;
      }
      int length=a.length;
      if (a2.length != length) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (a[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
