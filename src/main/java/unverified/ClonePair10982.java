package unverified;

public class ClonePair10982 {

    int method1(byte[] array,byte[] pattern,int start){
      int subPosition=0;
      for (int i=start; i < array.length; i++) {
        if (array[i] == pattern[subPosition]) {
          if (++subPosition == pattern.length) {
            return i - subPosition + 1;
          }
        }
     else {
          subPosition=0;
        }
      }
      return -1;
    }

    int method2(byte[] array,byte[] subarray,int startIndex){
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
}
