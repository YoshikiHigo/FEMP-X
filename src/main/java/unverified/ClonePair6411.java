package unverified;

public class ClonePair6411 {

    long method1(byte[] data,int offset){
      long value=0;
      for (int i=offset + 7; i >= offset; i--) {
        value<<=8;
        value|=((long)data[i]) & 0xff;
      }
      return value;
    }

    long method2(byte[] bytes,int offset){
      long ret=0;
      for (int i=7; i >= 0; i--) {
        ret<<=8;
        ret|=bytes[offset + i] & 0xFF;
      }
      return ret;
    }
}
