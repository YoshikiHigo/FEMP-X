package unverified;

public class ClonePair6402 {

    long method1(byte[] array,int offset){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret<<=8;
        ret|=array[7 - i + offset] & 0xFF;
      }
      return ret;
    }

    long method2(byte[] array,int index){
      long value=0;
      int shift=0;
      while (shift != 64) {
        value|=(0x00000000000000ff & ((long)array[index])) << shift;
        index++;
        shift+=8;
      }
      return value;
    }
}
