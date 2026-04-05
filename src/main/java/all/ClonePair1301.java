package all;

public class ClonePair1301 {

    boolean method1(byte[] b1,byte[] b2){
      boolean result=false;
      if (b1 == null && b2 == null)   return true;
      if (b1 != null && b2 != null) {
        result=b1.length == b2.length;
        if (result)     for (int i=0; i < b1.length; i++)     if (b1[i] != b2[i])     result=false;
      }
      return result;
    }

    boolean method2(byte[] array1,byte[] array2){
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
}
