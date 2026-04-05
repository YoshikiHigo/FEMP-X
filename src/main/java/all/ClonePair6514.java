package all;

public class ClonePair6514 {

    long method1(byte[] b,int offset){
      long accum=0;
      long shiftedval;
      for (int shiftBy=0, i=offset; shiftBy < 64; shiftBy+=8, i++) {
        shiftedval=((long)(b[i] & 0xff)) << shiftBy;
        accum|=shiftedval;
      }
      return accum;
    }

    long method2(byte[] array,int index){
      long value=0;
      int shift=0;
      while (shift != 64) {
        value|=(0x00000000000000ff & ((long)array[index])) << shift;
        index++;
        shift+=8;
      }
      return value;
    }
}
