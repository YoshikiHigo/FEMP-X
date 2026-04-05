package unverified;

public class ClonePair6020 {

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
