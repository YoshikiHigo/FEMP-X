package all;

public class ClonePair10005 {

    int method1(byte[] b,int offset,int length){
      int v=0;
      while (length-- > 0) {
        v=v << 8 | b[offset++] & 0xff;
      }
      return v;
    }

    int method2(byte[] buf,int offs,int len){
      int ret=0;
      for (int i=0; i < len; i++) {
        int b=buf[offs + i];
        if (b < 0)     b+=256;
        ret=(ret << 8) + b;
      }
      return ret;
    }
}
