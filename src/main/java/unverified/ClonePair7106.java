package unverified;

public class ClonePair7106 {

    int method1(byte[] byteArray,int byteArrayOffset){
      int result=0;
      int tmp;
      for (int i=0; i < 4; i++) {
        tmp=(byteArray[byteArrayOffset + i] + 256) & 0xFF;
        result+=(tmp << 8 * (3 - i));
      }
      return result;
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
