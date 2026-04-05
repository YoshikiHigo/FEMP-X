package unverified;

public class ClonePair7824 {

    int method1(byte[] array,byte value,int fromIndex){
      while (fromIndex < array.length) {
        if (array[fromIndex] == value)     return fromIndex;
     else     fromIndex++;
      }
      return -1;
    }

    int method2(byte[] ar,byte b,int from){
      for (int i=from; i < ar.length; i++) {
        if (ar[i] == b)     return i;
      }
      return -1;
    }
}
