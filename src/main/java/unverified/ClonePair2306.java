package unverified;

public class ClonePair2306 {

    int method1(byte[] bytes){
      int i=0;
      int j=24;
      for (int k=0; j >= 0; k++) {
        int l=bytes[k] & 0xff;
        i+=(l << j);
        j-=8;
      }
      return i;
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
