package unverified;

public class ClonePair12839 {

    boolean method1(Class[] p1,Class[] p2){
      if (p1.length == p2.length) {
        for (int i=0; i < p1.length; i++)     if (p1[i] != p2[i])     return false;
        return true;
      }
     else   return false;
    }

    boolean method2(Class[] array1,Class[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }
}
