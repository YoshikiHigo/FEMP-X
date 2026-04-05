package unverified;

public class ClonePair6737 {

    long method1(byte[] ba){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret=ret << 8;
        long b=ba[i] & 0xFF;
        ret|=b;
      }
      return ret;
    }

    long method2(byte[] timeoutIndex){
      long timeout;
      int tmp;
      int i;
      for (timeout=0, i=0; i < 8; i++) {
        tmp=((int)timeoutIndex[i]) & 0xff;
        timeout<<=8;
        timeout+=tmp;
      }
      return timeout;
    }
}
