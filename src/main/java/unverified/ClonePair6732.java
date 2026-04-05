package unverified;

public class ClonePair6732 {

    long method1(byte[] b){
      long value=0;
      for (int i=0; i < 8; i++) {
        int shift=(7 - i) * 8;
        value+=(long)((long)(b[i] & 0x00000000000000FF) << shift);
      }
      return value;
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
