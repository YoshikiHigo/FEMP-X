package all;

public class ClonePair7825 {

    int method1(byte[] array,byte value,int fromIndex){
      while (fromIndex < array.length) {
        if (array[fromIndex] == value)     return fromIndex;
     else     fromIndex++;
      }
      return -1;
    }

    int method2(byte[] bytes,byte c,int off){
      for (int i=off; i < bytes.length; i++) {
        if (bytes[i] == c) {
          return i;
        }
     else     if (bytes[i] == 0x29) {
          return -1;
        }
      }
      return -1;
    }
}
