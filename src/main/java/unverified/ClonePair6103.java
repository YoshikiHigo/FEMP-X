package unverified;

public class ClonePair6103 {

    boolean method1(Object[] ar1,Object[] ar2){
      if (ar1 == ar2) {
        return true;
      }
      if (ar1 == null) {
        return ar2 == null;
      }
      if (ar2 == null) {
        return false;
      }
      int len1=ar1.length;
      int len2=ar2.length;
      if (len1 != len2) {
        return false;
      }
      for (int i=0; i < len1; i++) {
        if ((ar1[i] != null && !ar1[i].equals(ar2[i])) || (ar1[i] == null && ar2[i] != null)) {
          return false;
        }
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
