package all;

public class ClonePair3447 {

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

    boolean method2(int[] a,int[] a2){
      if (a == a2)   return true;
      if (a == null || a2 == null)   return false;
      int length=a.length;
      if (a2.length != length)   return false;
      for (int i=0; i < length; i++)   if (a[i] != a2[i])   return false;
      return true;
    }
}
