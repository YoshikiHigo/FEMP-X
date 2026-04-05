package unverified;

public class ClonePair7135 {

    int method1(byte[] arr,int offset){
      int value=0;
      final int end=offset + 4;
      for (int i=offset, shift=0; i < end; i++, shift+=8) {
        value|=(arr[i] & 0x000000FF) << shift;
      }
      return value;
    }

    int method2(byte[] bytes,int offset){
      int ret=0;
      for (int i=3; i >= 0; i--) {
        ret<<=8;
        ret|=bytes[offset + i] & 0xFF;
      }
      return ret;
    }
}
