package unverified;

public class ClonePair3379 {

    boolean method1(int[] expected,int[] actual){
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

    boolean method2(int[] test1,int[] test2){
      boolean isEqual=true;
      if (test1.length != test2.length) {
        isEqual=false;
      }
     else {
        for (int i=0; i < test1.length; i++) {
          if (test1[i] != test2[i]) {
            isEqual=false;
            break;
          }
        }
      }
      return isEqual;
    }
}
