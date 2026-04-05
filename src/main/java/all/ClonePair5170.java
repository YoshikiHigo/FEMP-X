package all;

public class ClonePair5170 {

    boolean method1(double[] a1,double[] a2){
      if (a1 == null || a2 == null || a1.length != a2.length) {
        return false;
      }
      for (int i=0; i < a1.length; i++) {
        if (Float.floatToIntBits((float)a1[i]) != Float.floatToIntBits((float)a2[i])) {
          return false;
        }
      }
      return true;
    }

    boolean method2(double[] arr1,double[] arr2){
      if (arr1 == null || arr2 == null || arr1.length != arr2.length)   return false;
      for (int i=0; i < arr1.length; i++)   if (arr1[i] != arr2[i])   return false;
      return true;
    }
}
