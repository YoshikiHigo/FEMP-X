package all;

public class ClonePair10979 {

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

    int method2(byte[] srcArray,byte[] subArray,int beginIndex){
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
}
