package unverified;

public class ClonePair5891 {

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
      long lngBits=0;
      long current;
      int shift=0;
      for (int i=0; i < 8; i++) {
        current=bytes[offset + i];
        lngBits+=(current << shift);
        shift+=8;
      }
      return Double.longBitsToDouble(lngBits);
    }
}
