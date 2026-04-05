package all;

public class ClonePair5165 {

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

    boolean method2(double[] arr1,double[] arr2){
      if (arr1 == null || arr2 == null || arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; i++)   if (arr1[i] != arr2[i])   return false;
      return true;
    }
}
