package unverified;

public class ClonePair7295 {

    int method1(byte[] data,int offset){
      int l=0;
      for (int k=0; k < 4; k++) {
        l=(l << 8) | (data[offset++] & 0xFF);
      }
      return l;
    }

    int method2(byte[] arr,int start){
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
}
