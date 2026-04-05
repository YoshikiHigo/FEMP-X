package unverified;

public class ClonePair6373 {

    long method1(byte[] data,int offset){
      long ret=data[offset];
      for (int i=1; i < 8; ++i) {
        ret=ret << 8;
        ret=ret | (data[offset + i] & 0xff);
      }
      return ret;
    }

    long method2(byte[] buffer,int start){
      long value=0;
      for (int i=start; i < start + 8; i++) {
        value=(value << 8) + (buffer[i] & 0xff);
      }
      return value;
    }
}
