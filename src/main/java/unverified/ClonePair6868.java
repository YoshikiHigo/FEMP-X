package unverified;

public class ClonePair6868 {

    int method1(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value+=(array[offset + i] & 0xff) << (8 * i);
      }
      return value;
    }

    int method2(byte[] arr,int offset){
      int value=0;
      final int end=offset + 4;
      for (int i=offset, shift=0; i < end; i++, shift+=8) {
        value|=(arr[i] & 0x000000FF) << shift;
      }
      return value;
    }
}
