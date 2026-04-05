package unverified;

public class ClonePair5134 {

    boolean method1(double[] a,double[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (Double.doubleToLongBits(a[i]) != Double.doubleToLongBits(a2[i]))   return false;
      return true;
    }

    boolean method2(double[] a1,double[] a2){
      if (a1 == a2)   return true;
      if (null == a1 || null == a2)   return false;
      if (a1.length == a2.length) {
        int i=a1.length;
        while (--i >= 0)     if (a1[i] - a2[i] != 0)     return false;
        return true;
      }
      return false;
    }
}
