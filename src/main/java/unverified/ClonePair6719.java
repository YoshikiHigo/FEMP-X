package unverified;

public class ClonePair6719 {

    long method1(byte[] arr){
      long i=0x0000000000000000;
      for (int j=0; j < 8; ++j) {
        i<<=8;
        i+=arr[j] & 0x000000FF;
      }
      return i;
    }

    long method2(byte[] bytes){
      long n=0;
      for (int i=0; i < 7; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[7] & 0xff);
    }
}
