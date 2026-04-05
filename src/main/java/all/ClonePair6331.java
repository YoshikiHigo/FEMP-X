package all;

public class ClonePair6331 {

    long method1(byte[] data,int offset){
      long x=0;
      for (int i=7; i >= 0; i--) {
        long y=data[offset + i] & 0xFF;
        x=(x << 8) | y;
      }
      return x;
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
