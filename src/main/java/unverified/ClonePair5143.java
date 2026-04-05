package unverified;

public class ClonePair5143 {

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

    boolean method2(double[] arr1,double[] arr2){
      if (arr1 == null || arr2 == null || arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; i++)   if (arr1[i] != arr2[i])   return false;
      return true;
    }
}
