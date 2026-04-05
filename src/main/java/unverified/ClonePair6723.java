package unverified;

public class ClonePair6723 {

    long method1(byte[] bytes){
      long n=0;
      for (int i=0; i < 7; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[7] & 0xff);
    }

    long method2(byte[] b){
      long value=0;
      for (int i=0; i < 8; i++) {
        int shift=(7 - i) * 8;
        value+=(long)((long)(b[i] & 0x00000000000000FF) << shift);
      }
      return value;
    }
}
