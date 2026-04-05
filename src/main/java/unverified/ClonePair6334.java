package unverified;

public class ClonePair6334 {

    long method1(byte[] data,int offset){
      long x=0;
      for (int i=7; i >= 0; i--) {
        long y=data[offset + i] & 0xFF;
        x=(x << 8) | y;
      }
      return x;
    }

    long method2(byte[] b,int offset){
      long accum=0;
      long shiftedval;
      for (int shiftBy=0, i=offset; shiftBy < 64; shiftBy+=8, i++) {
        shiftedval=((long)(b[i] & 0xff)) << shiftBy;
        accum|=shiftedval;
      }
      return accum;
    }
}
