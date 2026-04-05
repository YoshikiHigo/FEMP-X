package all;

public class ClonePair5169 {

    boolean method1(double[] array1,double[] array2){
      if ((array1 == null) && (array2 == null))   return true;
      if ((array1 == null) || (array2 == null))   return false;
      if (array1.length != array2.length)   return false;
      for (int i=0; i < array2.length; i++) {
        if (array1[i] != array2[i])     return false;
      }
      return true;
    }

    boolean method2(double[] a1,double[] a2){
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
}
