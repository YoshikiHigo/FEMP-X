package unverified;

public class ClonePair2318 {

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

    int method2(byte[] data){
      int number;
      number=0;
      for (int i=0; i < 4; ++i) {
        number|=(data[3 - i] & 0xff) << (i << 3);
      }
      return number;
    }
}
