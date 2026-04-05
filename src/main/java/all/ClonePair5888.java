package all;

public class ClonePair5888 {

    double method1(byte[] arr,int offset){
      int i=0;
      final int len=8;
      int cnt=0;
      final byte[] tmp=new byte[len];
      for (i=offset; i < (offset + len); i++) {
        tmp[cnt]=arr[i];
        cnt++;
      }
      long accum=0;
      i=0;
      for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
        accum|=((long)(tmp[i] & 0xff)) << shiftBy;
        i++;
      }
      return Double.longBitsToDouble(accum);
    }

    double method2(byte[] b,int offset){
      long accum=0;
      long shiftedval;
      for (int shiftBy=0, i=offset; shiftBy < 64; shiftBy+=8, i++) {
        shiftedval=((long)(b[i] & 0xff)) << shiftBy;
        accum|=shiftedval;
      }
      return Double.longBitsToDouble(accum);
    }
}
