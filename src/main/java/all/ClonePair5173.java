package all;

public class ClonePair5173 {

    boolean method1(double[] arr1,double[] arr2){
      if (arr1 == null || arr2 == null || arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; i++)   if (arr1[i] != arr2[i])   return false;
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
