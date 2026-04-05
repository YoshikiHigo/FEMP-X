package unverified;

public class ClonePair6347 {

    long method1(byte[] byte_array,int offset){
      long value=0;
      for (int i=7; i >= 0; i--) {
        value=(long)(value << 8);
        value=(long)(value | ((long)byte_array[offset + i] & 0xff));
      }
      return value;
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
