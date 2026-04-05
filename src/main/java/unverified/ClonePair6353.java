package unverified;

public class ClonePair6353 {

    long method1(byte[] array,int offset){
      long value=0;
      for (int i=0; i < 8; i++) {
        value=(value << 8) + (array[offset + i] & 0xff);
      }
      return value;
    }

    long method2(byte[] b,int offset){
      long value=0;
      for (int i=0; i < 8; i++) {
        int shift=(8 - 1 - i) * 8;
        value+=((long)(b[i + offset] & 0x00000000000000FF) << shift);
      }
      return value;
    }
}
