package unverified;

public class ClonePair5135 {

    boolean method1(double[] a,double[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (Double.doubleToLongBits(a[i]) != Double.doubleToLongBits(a2[i]))   return false;
      return true;
    }

    boolean method2(double[] arr1,double[] arr2){
      if (arr1 == null || arr2 == null || arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; i++)   if (arr1[i] != arr2[i])   return false;
      return true;
    }
}
