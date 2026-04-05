package unverified;

public class ClonePair5158 {

    boolean method1(double[] arr1,double[] arr2){
      if (arr1.length != arr2.length)   return false;
      for (int index=0; index < arr1.length; index++)   if (arr1[index] != arr2[index])   return false;
      return true;
    }

    boolean method2(double[] a,double[] b){
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }
}
