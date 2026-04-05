package all;

public class ClonePair6018 {

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
