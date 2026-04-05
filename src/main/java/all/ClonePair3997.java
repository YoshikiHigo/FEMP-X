package all;

public class ClonePair3997 {

    float method1(byte[] arr,int offset){
      int i=0;
      final int len=4;
      int cnt=0;
      final byte[] tmp=new byte[len];
      for (i=offset; i < (offset + len); i++) {
        tmp[cnt]=arr[i];
        cnt++;
      }
      int accum=0;
      i=0;
      for (int shiftBy=0; shiftBy < 32; shiftBy+=8) {
        accum|=((long)(tmp[i] & 0xff)) << shiftBy;
        i++;
      }
      return Float.intBitsToFloat(accum);
    }

    float method2(byte[] b,int offset){
      int accum=0;
      for (int shiftBy=0, i=offset; shiftBy < 32; shiftBy+=8, i++) {
        accum|=(b[i] & 0xff) << shiftBy;
      }
      return Float.intBitsToFloat(accum);
    }
}
