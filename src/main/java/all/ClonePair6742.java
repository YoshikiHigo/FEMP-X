package all;

public class ClonePair6742 {

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

    long method2(byte[] bytes){
      long result=0;
      for (int i=0; i < 8; i++) {
        result<<=8;
        result+=(byte)bytes[i];
      }
      return result;
    }
}
