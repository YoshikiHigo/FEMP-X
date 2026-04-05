package all;

public class ClonePair10277 {

    int method1(byte[] mpb,int start,int len){
      int uint=0;
      for (int i=0; i < len; i++) {
        uint+=(mpb[i + start] & 0xFF) << ((len - i - 1) * 8);
      }
      return uint;
    }

    int method2(byte[] data,int offset,int length){
      int code=0;
      for (int i=0; i < length; i++) {
        code<<=8;
        code|=(data[offset + i] + 256) % 256;
      }
      return code;
    }
}
