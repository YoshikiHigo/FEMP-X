package all;

public class ClonePair1750 {

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

    boolean method2(byte[] first,byte[] second){
      boolean out=first != null && second != null && first.length == second.length;
      for (int i=0; out && i < first.length; i++) {
        if (first[i] != second[i]) {
          out=false;
        }
      }
      return out;
    }
}
