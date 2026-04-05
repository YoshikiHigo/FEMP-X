package all;

public class ClonePair10987 {

    int method1(byte[] srcArray,byte[] subArray,int beginIndex){
      if (srcArray.length == 0 || subArray.length == 0) {
        return -1;
      }
      outer:   for (int i=beginIndex; i < srcArray.length; i++) {
        if (srcArray.length - i < subArray.length) {
          return -1;
        }
        for (int j=0; j < subArray.length; j++) {
          if (srcArray[i + j] != subArray[j]) {
            continue outer;
          }
        }
        return i;
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
