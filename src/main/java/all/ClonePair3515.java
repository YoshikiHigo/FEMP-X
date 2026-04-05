package all;

public class ClonePair3515 {

    boolean method1(int[] int1,int[] int2){
      boolean result=false;
      if (int1 == null || int2 == null) {
        return result;
      }
      if (int1.length == int2.length) {
        result=true;
        int i=0;
        while ((i < int1.length) & result) {
          result=((int1[i] == int2[i]));
          i++;
        }
      }
      return result;
    }

    boolean method2(int[] size1,int[] size2){
      if ((size1 == null) || (size2 == null))   return false;
      if (size1.length != size2.length)   return false;
      for (int i=0; i < size1.length; i++) {
        if (size1[i] != size2[i])     return false;
      }
      return true;
    }
}
