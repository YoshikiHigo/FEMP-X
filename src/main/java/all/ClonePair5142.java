package all;

public class ClonePair5142 {

    boolean method1(double[] a,double[] b){
      if (a == b) {
        return true;
      }
      if (a != null && b == null) {
        return false;
      }
      if (a == null && b != null) {
        return false;
      }
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    boolean method2(double[] array1,double[] array2){
      if ((array1 == null) && (array2 == null))   return true;
      if ((array1 == null) || (array2 == null))   return false;
      if (array1.length != array2.length)   return false;
      for (int i=0; i < array2.length; i++) {
        if (array1[i] != array2[i])     return false;
      }
      return true;
    }
}
