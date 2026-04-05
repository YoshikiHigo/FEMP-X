package all;

public class ClonePair7426 {

    int method1(byte[] arr,int start){
      int i=0;
      int len=4;
      int cnt=0;
      byte[] tmp=new byte[len];
      for (i=start; i < start + len; i++) {
        tmp[cnt]=arr[i];
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

    int method2(byte[] b,int offset){
      int value=0;
      int shift=0;
      for (int i=0; i < 4; i++) {
        shift=(4 - 1 - i) * 8;
        value+=(b[i + offset] & 0x000000FF) << shift;
      }
      return value;
    }
}
