package all;

public class ClonePair3380 {

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

    boolean method2(int[] a,int[] b){
      boolean result=false;
      if (a.length == b.length) {
        result=true;
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i]) {
            result=false;
            break;
          }
        }
      }
      return result;
    }
}
