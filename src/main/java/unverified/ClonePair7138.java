package unverified;

public class ClonePair7138 {

    int method1(byte[] arr,int offset){
      int value=0;
      final int end=offset + 4;
      for (int i=offset, shift=0; i < end; i++, shift+=8) {
        value|=(arr[i] & 0x000000FF) << shift;
      }
      return value;
    }

    int method2(byte[] array,int index){
      int value=0;
      int shift=0;
      while (shift != 32) {
        value|=(0x000000ff & ((int)array[index])) << shift;
        index++;
        shift+=8;
      }
      return value;
    }
}
