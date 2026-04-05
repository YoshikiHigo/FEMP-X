package unverified;

public class ClonePair6371 {

    long method1(byte[] data,int offset){
      long ret=data[offset];
      for (int i=1; i < 8; ++i) {
        ret=ret << 8;
        ret=ret | (data[offset + i] & 0xff);
      }
      return ret;
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
