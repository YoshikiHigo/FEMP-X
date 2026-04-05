package all;

public class ClonePair5136 {

    boolean method1(double[] a,double[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (Double.doubleToLongBits(a[i]) != Double.doubleToLongBits(a2[i]))   return false;
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
