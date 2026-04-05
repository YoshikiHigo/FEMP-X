package unverified;

public class ClonePair6721 {

    long method1(byte[] arr){
      long i=0x0000000000000000;
      for (int j=0; j < 8; ++j) {
        i<<=8;
        i+=arr[j] & 0x000000FF;
      }
      return i;
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
