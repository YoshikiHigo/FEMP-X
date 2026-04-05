package unverified;

public class ClonePair10152 {

    int method1(byte[] buf,int offs,int len){
      int ret=0;
      for (int i=0; i < len; i++) {
        int b=buf[offs + i];
        if (b < 0)     b+=256;
        ret=(ret << 8) + b;
      }
      return ret;
    }

    int method2(byte[] mpb,int start,int len){
      int uint=0;
      for (int i=0; i < len; i++) {
        uint+=(mpb[i + start] & 0xFF) << ((len - i - 1) * 8);
      }
      return uint;
    }
}
