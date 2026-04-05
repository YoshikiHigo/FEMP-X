package unverified;

public class ClonePair7133 {

    int method1(byte[] arr,int offset){
      int value=0;
      final int end=offset + 4;
      for (int i=offset, shift=0; i < end; i++, shift+=8) {
        value|=(arr[i] & 0x000000FF) << shift;
      }
      return value;
    }

    int method2(byte[] arr,int start){
      int i=0;
      int len=4;
      int cnt=0;
      byte[] tmp=new byte[len];
      for (i=start; i < start + len; i++) {
        tmp[len - cnt - 1]=arr[i];
        cnt++;
      }
      int accum=0;
      int shiftBy=0;
      for (i=4; i > 0; i--) {
        accum|=((int)(tmp[i - 1] & 0xff)) << shiftBy;
        shiftBy+=8;
      }
      return accum;
    }
}
