package all;

public class ClonePair10274 {

    int method1(byte[] mpb,int start,int len){
      int uint=0;
      for (int i=0; i < len; i++) {
        uint+=(mpb[i + start] & 0xFF) << ((len - i - 1) * 8);
      }
      return uint;
    }

    int method2(byte[] buffer,int pos,int length){
      int value;
      int shift;
      value=shift=0;
      int i=pos;
      while (--length >= 0) {
        value+=(buffer[i++] & 0xff) << shift;
        shift+=8;
      }
      return value;
    }
}
