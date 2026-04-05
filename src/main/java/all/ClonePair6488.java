package all;

public class ClonePair6488 {

    long method1(byte[] in,int idx){
      long out=0;
      for (int i=0; i < 8; i++)   out|=((long)in[idx + i] & 0xff) << i * 8;
      return out;
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
