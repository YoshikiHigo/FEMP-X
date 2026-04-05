package all;

public class ClonePair1746 {

    boolean method1(byte[] array1,byte[] array2){
      boolean equal=false;
      if (array1 == array2) {
        equal=true;
      }
     else   if ((array1 != null) && (array2 != null)) {
        int length=array1.length;
        if (length == array2.length) {
          equal=true;
          for (int i=0; i < length; i++) {
            if (array1[i] != array2[i]) {
              equal=false;
              break;
            }
          }
        }
     else {
          equal=false;
        }
      }
     else {
        equal=false;
      }
      return equal;
    }

    boolean method2(byte[] a1,byte[] a2){
      if (a1 == null) {
        if (a2 == null) {
          return true;
        }
        return false;
      }
     else   if (a2 == null) {
        return false;
      }
      if (a1.length != a2.length)   return false;
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i])     return false;
      }
      return true;
    }
}
