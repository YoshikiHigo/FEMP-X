package all;

public class ClonePair6060 {

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

    boolean method2(Object[] ar1,Object[] ar2){
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
}
