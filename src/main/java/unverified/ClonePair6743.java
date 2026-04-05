package unverified;

public class ClonePair6743 {

    long method1(byte[] timeoutIndex){
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

    long method2(byte[] rd){
      long dd=0;
      for (int i=0; i <= 7; i++)   dd=(dd << 8) | ((long)rd[i] & 0xff);
      return dd;
    }
}
