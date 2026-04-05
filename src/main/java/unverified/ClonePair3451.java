package unverified;

public class ClonePair3451 {

    boolean method1(int[] array1,int[] array2){
      boolean result=false;
      if (array1 == null) {
        result=array2 == null;
      }
     else   if (array2 != null) {
        result=array1.length == array2.length;
        for (int i=0; (i < array1.length) && result; i++) {
          result=array1[i] == array2[i];
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
