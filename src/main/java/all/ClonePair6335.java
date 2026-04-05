package all;

public class ClonePair6335 {

    long method1(byte[] data,int offset){
      long x=0;
      for (int i=7; i >= 0; i--) {
        long y=data[offset + i] & 0xFF;
        x=(x << 8) | y;
      }
      return x;
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
