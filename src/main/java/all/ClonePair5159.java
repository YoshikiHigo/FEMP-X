package all;

public class ClonePair5159 {

    boolean method1(double[] x,double[] y){
      if (x.length != y.length) {
        return false;
      }
      for (int i=0; i < y.length; i++) {
        if (x[i] != y[i]) {
          return false;
        }
      }
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
