package unverified;

public class ClonePair5157 {

    boolean method1(double[] arr1,double[] arr2){
      if (arr1.length != arr2.length)   return false;
      for (int index=0; index < arr1.length; index++)   if (arr1[index] != arr2[index])   return false;
      return true;
    }

    boolean method2(double[] expected,double[] actual){
      boolean success=true;
      if (expected.length != actual.length)   return false;
      for (int i=0; i < expected.length; i++) {
        if (expected[i] != actual[i]) {
          success=false;
          break;
        }
      }
      return success;
    }
}
