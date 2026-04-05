package all;

public class ClonePair6720 {

    long method1(byte[] arr){
      long i=0x0000000000000000;
      for (int j=0; j < 8; ++j) {
        i<<=8;
        i+=arr[j] & 0x000000FF;
      }
      return i;
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
