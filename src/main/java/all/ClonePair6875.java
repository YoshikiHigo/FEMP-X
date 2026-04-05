package all;

public class ClonePair6875 {

    int method1(byte[] array,int offset){
      int value=0;
      for (int i=0; i < 4; i++) {
        value+=(array[offset + i] & 0xff) << (8 * i);
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
