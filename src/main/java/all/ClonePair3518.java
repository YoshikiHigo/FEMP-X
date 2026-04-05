package all;

public class ClonePair3518 {

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

    boolean method2(int[] a,int[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
      return true;
    }
}
