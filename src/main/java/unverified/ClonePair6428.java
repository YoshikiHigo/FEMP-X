package unverified;

public class ClonePair6428 {

    long method1(byte[] buffer,int start){
      long value=0;
      for (int i=start; i < start + 8; i++) {
        value=(value << 8) + (buffer[i] & 0xff);
      }
      return value;
    }

    long method2(byte[] b,int start){
      long l=0;
      for (int i=0; i < 8; i++) {
        l<<=8;
        l|=b[start + i] & 0xff;
      }
      return l;
    }
}
