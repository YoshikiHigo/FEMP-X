package unverified;

public class ClonePair3382 {

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

    boolean method2(int[] a1,int[] a2){
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++)   if (Character.toLowerCase((char)a1[i]) != Character.toLowerCase((char)a2[i]))   return false;
      return true;
    }
}
