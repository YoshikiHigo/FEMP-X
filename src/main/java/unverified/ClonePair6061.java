package unverified;

public class ClonePair6061 {

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

    boolean method2(Object[] a,Object[] b){
      if (a == b)   return true;
      if ((a == null && b != null) || (a != null && b == null))   return false;
      if (a == null && b == null)   return true;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] == null) {
          if (b[i] != null)       return false;
        }
     else {
          if (!a[i].equals(b[i]))       return false;
        }
      }
      return true;
    }
}
