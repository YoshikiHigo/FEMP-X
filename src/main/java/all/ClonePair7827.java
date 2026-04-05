package all;

public class ClonePair7827 {

    int method1(byte[] array,byte value,int fromIndex){
      while (fromIndex < array.length) {
        if (array[fromIndex] == value)     return fromIndex;
     else     fromIndex++;
      }
      return -1;
    }

    int method2(byte[] ary,byte b,int start){
      for (int i=start; i < ary.length; i++) {
        if (b == ary[i]) {
          return i;
        }
      }
      return -1;
    }
}
