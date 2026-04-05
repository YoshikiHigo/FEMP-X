package all;

public class ClonePair7425 {

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

    int method2(byte[] bytes,int offset){
      int b=0;
      for (int j=0; j < 4; j++)   b=(b << 8) | (bytes[j + offset] & 0xFF);
      return b;
    }
}
