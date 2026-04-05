package all;

public class ClonePair8381 {

    boolean method1(byte[] array1,byte[] array2,int length){
      if (array1 == array2) {
        return true;
      }
      if (array1 == null || array2 == null || array1.length < length || array2.length < length) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] left,byte[] right,int length){
      if (left == null) {
        return ((right == null) ? true : false);
      }
      if (right == null) {
        return ((left == null) ? true : false);
      }
      if (left.length < length || right.length < length)   if (left.length != right.length)   return false;
      int minarray=(left.length < right.length) ? left.length : right.length;
      int minlen=(length < minarray) ? length : minarray;
      for (int i=0; i < minlen; i++) {
        if (left[i] != right[i])     return false;
      }
      return true;
    }
}
