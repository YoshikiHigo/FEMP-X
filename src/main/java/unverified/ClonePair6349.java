package unverified;

public class ClonePair6349 {

    long method1(byte[] byte_array,int offset){
      long value=0;
      for (int i=7; i >= 0; i--) {
        value=(long)(value << 8);
        value=(long)(value | ((long)byte_array[offset + i] & 0xff));
      }
      return value;
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
