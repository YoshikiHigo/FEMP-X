package all;

public class ClonePair6724 {

    long method1(byte[] bytes){
      long n=0;
      for (int i=0; i < 7; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[7] & 0xff);
    }

    long method2(byte[] ba){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret=ret << 8;
        long b=ba[i] & 0xFF;
        ret|=b;
      }
      return ret;
    }
}
