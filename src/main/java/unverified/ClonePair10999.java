package unverified;

public class ClonePair10999 {

    int method1(byte[] array,byte[] subarray,int startIndex){
      for (int i=startIndex; i < array.length; i++) {
        boolean found=true;
        if (i + subarray.length > array.length) {
          break;
        }
        for (int j=0; j < subarray.length; j++) {
          final byte a=array[i + j];
          final byte b=subarray[j];
          if (a != b) {
            found=false;
            break;
          }
        }
        if (found) {
          return i;
        }
      }
      return -1;
    }

    int method2(byte[] bytes,byte[] pattern,int start){
      if (pattern.length == 0) {
        return start;
      }
      if (start > bytes.length) {
        return -1;
      }
      int last=bytes.length - pattern.length + 1;
      next:   for (; start < last; start++) {
        for (int i=0; i < pattern.length; i++) {
          if (bytes[start + i] != pattern[i]) {
            continue next;
          }
        }
        return start;
      }
      return -1;
    }
}
