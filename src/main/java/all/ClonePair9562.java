package all;

public class ClonePair9562 {

    boolean method1(char[] ch1,char[] ch2){
      if (ch1 == null) {
        if (ch2 == null) {
          return true;
        }
     else {
          return false;
        }
      }
     else   if (ch2 == null) {
        return false;
      }
      if (ch1.length != ch2.length)   return false;
      for (int i=0; i < ch1.length; i++) {
        if (ch1[i] != ch2[i])     return false;
      }
      return true;
    }

    boolean method2(char[] array1,char[] array2){
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
