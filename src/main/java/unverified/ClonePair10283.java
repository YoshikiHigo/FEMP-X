package unverified;

public class ClonePair10283 {

    int method1(byte[] mpb,int start,int len){
      int uint=0;
      for (int i=0; i < len; i++) {
        uint+=(mpb[i + start] & 0xFF) << ((len - i - 1) * 8);
      }
      return uint;
    }

    int method2(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0)   v=(v << 8) | (b[offset++] & 0xff);
      return v;
    }
}
