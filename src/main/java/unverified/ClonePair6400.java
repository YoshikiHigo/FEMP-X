package unverified;

public class ClonePair6400 {

    long method1(byte[] array,int offset){
      long ret=0;
      for (int i=0; i < 8; i++) {
        ret<<=8;
        ret|=array[7 - i + offset] & 0xFF;
      }
      return ret;
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
