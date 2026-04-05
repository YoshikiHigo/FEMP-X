package unverified;

public class ClonePair6420 {

    long method1(byte[] data,int offset){
      long result=0;
      int i=offset;
      for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
        result|=((long)(data[i] & 0xff)) << shiftBy;
        ++i;
      }
      return result;
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
