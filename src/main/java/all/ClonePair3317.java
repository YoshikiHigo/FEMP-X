package all;

public class ClonePair3317 {

    boolean method1(int[] o1,int[] o2){
      if (o1.length != o2.length) {
        return false;
      }
     else {
        for (int i=0; i < o1.length; i++) {
          if (o1[i] != o2[i]) {
            return false;
          }
        }
        return true;
      }
    }

    boolean method2(int[] expected,int[] actual){
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
