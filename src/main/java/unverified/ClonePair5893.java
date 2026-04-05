package unverified;

public class ClonePair5893 {

    double method1(byte[] b,int offset){
      long accum=0;
      long shiftedval;
      for (int shiftBy=0, i=offset; shiftBy < 64; shiftBy+=8, i++) {
        shiftedval=((long)(b[i] & 0xff)) << shiftBy;
        accum|=shiftedval;
      }
      return Double.longBitsToDouble(accum);
    }

    double method2(byte[] bytes,int offset){
      long accum=0;
      for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
        accum|=((long)(bytes[offset++] & 0xff)) << shiftBy;
      }
      return Double.longBitsToDouble(accum);
    }
}
