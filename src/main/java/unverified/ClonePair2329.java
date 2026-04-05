package unverified;

public class ClonePair2329 {

    int method1(byte[] bytes){
      int n=0;
      for (int i=0; i < 3; i++) {
        n=n | (bytes[i] & 0xff);
        n=n << 8;
      }
      return n | (bytes[3] & 0xff);
    }

    int method2(byte[] arr){
      int i=0x00000000, j;
      for (j=0; j < 4; ++j) {
        i<<=8;
        i+=arr[j] & 0x000000FF;
      }
      return i;
    }
}
