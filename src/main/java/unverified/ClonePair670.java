package unverified;

public class ClonePair670 {

    boolean method1(byte[] array1,byte[] array2){
      if (array1 == null && array2 == null)   return true;
      if (array1 == null && array2 != null)   return false;
      if (array1 != null && array2 == null)   return false;
      if (array1.length != array2.length) {
        System.out.println("diff length, array1 " + array1.length + ", array2 "+ array2.length);
        return false;
      }
      for (int i=0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
          System.out.println("diff byte at " + i);
          return false;
        }
      }
      return true;
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
