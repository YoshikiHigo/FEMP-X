package unverified;

public class ClonePair6600 {

    boolean method1(long[] a,long[] b){
      if (a == b)   return true;
      if ((a == null) || (b == null))   return false;
      int i=a.length;
      if (b.length != i)   return false;
      while (--i >= 0)   if (a[i] != b[i])   return false;
      return true;
    }

    boolean method2(long[] array1,long[] array2){
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
