package all;

public class ClonePair3411 {

    boolean method1(int[] a,int[] b){
      if (a == b)   return true;
      if (a == null || b == null)   return false;
      if (a.length != b.length)   return false;
      for (int i=0; i < a.length; i++) {
        if (a[i] != b[i])     return false;
      }
      return true;
    }

    boolean method2(int[] array1,int[] array2){
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
}
