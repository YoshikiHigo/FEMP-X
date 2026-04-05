package all;

public class ClonePair1775 {

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

    boolean method2(byte[] val1,byte[] val2){
      boolean more;
      int i;
      if (val1 == null && val2 == null) {
        return true;
      }
      more=val1 != null && val2 != null && val1.length == val2.length;
      for (i=0; more && i < val1.length; i++) {
        more=val1[i] == val2[i];
      }
      return more;
    }
}
