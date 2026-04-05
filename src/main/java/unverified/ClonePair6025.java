package unverified;

public class ClonePair6025 {

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

    boolean method2(Object[] o1,Object[] o2){
      if (o1 == null && o2 == null) {
        return true;
      }
     else   if (o1 == null || o2 == null) {
        return false;
      }
      if (o1.length != o2.length) {
        return false;
      }
      for (int i=0; i < o1.length; i++) {
        if (o1[i] != o2[i]) {
          return false;
        }
      }
      return true;
    }
}
