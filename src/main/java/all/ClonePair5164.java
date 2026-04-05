package all;

public class ClonePair5164 {

    boolean method1(double[] a1,double[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] - a2[i] != 0)     return false;
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
