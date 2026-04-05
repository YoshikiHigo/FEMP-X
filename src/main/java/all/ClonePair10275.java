package all;

public class ClonePair10275 {

    int method1(byte[] mpb,int start,int len){
      int uint=0;
      for (int i=0; i < len; i++) {
        uint+=(mpb[i + start] & 0xFF) << ((len - i - 1) * 8);
      }
      return uint;
    }

    int method2(byte[] data,int offset,int bytes){
      int result=0;
      for (int i=offset; i < offset + bytes; i++) {
        result*=256;
        int b=data[i];
        if (b < 0) {
          b+=256;
        }
        result+=b;
      }
      return result;
    }
}
