package unverified;

public class ClonePair6994 {

    int method1(byte[] data,int offset){
      int res=0;
      for (int i=0; i < 4; i++) {
        res=(res << 8) | (data[offset + i] & 0xff);
      }
      return res;
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
