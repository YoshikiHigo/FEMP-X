package all;

public class ClonePair6725 {

    long method1(byte[] bytes){
      long n=0;
      for (int i=0; i < 7; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[7] & 0xff);
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
