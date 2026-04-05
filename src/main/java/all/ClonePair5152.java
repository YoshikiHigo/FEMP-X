package all;

public class ClonePair5152 {

    boolean method1(double[] p_D0,double[] p_D1){
      if (p_D0 == p_D1) {
        return true;
      }
      if (p_D0 == null || p_D1 == null || p_D0.length != p_D1.length) {
        return false;
      }
      for (int i=0; i < p_D0.length; i++) {
        if (p_D0[i] != p_D1[i]) {
          return false;
        }
      }
      return true;
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
