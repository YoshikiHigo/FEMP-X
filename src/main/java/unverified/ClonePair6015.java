package unverified;

public class ClonePair6015 {

    boolean method1(Object[] array1,Object[] array2){
      if (array1 == null) {
        return (array2 == null);
      }
      if (array2 == null) {
        return false;
      }
      if (array1.length != array2.length) {
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] == null) {
          if (array2[i] != null) {
            return false;
          }
        }
        if (array2[i] == null) {
          if (array1[i] != null) {
            return false;
          }
        }
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(Object[] ar1,Object[] ar2){
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
}
