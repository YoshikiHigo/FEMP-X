package unverified;

public class ClonePair3356 {

    boolean method1(int[] a1,int[] a2){
      if (a1 == a2) {
        return true;
      }
     else   if (a1 == null || a2 == null) {
        return false;
      }
     else   if (a1.length != a2.length) {
        return false;
      }
     else {
        for (int i=0; i < a1.length; i++) {
          if (a1[i] != a2[i]) {
            return false;
          }
        }
        return true;
      }
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
