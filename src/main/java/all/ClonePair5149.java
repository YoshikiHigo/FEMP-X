package all;

public class ClonePair5149 {

    boolean method1(double[] vec1,double[] vec2){
      if (vec1.length != vec2.length)   return (false);
      for (int i=0; i < vec1.length; ++i)   if (vec1[i] != vec2[i])   return (false);
      return (true);
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
