package all;

public class ClonePair6340 {

    long method1(byte[] byte_array,int offset){
      long value=0;
      for (int i=7; i >= 0; i--) {
        value=(long)(value << 8);
        value=(long)(value | ((long)byte_array[offset + i] & 0xff));
      }
      return value;
    }

    long method2(byte[] array,int offset){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret<<=8;
        ret|=array[7 - i + offset] & 0xFF;
      }
      return ret;
    }
}
