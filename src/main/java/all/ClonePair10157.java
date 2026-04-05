package all;

public class ClonePair10157 {

    int method1(byte[] buf,int offs,int len){
      int ret=0;
      for (int i=0; i < len; i++) {
        int b=buf[offs + i];
        if (b < 0)     b+=256;
        ret=(ret << 8) + b;
      }
      return ret;
    }

    int method2(byte[] p,int off,int len){
      int ret=0;
      int done=off + len;
      for (int i=off; i < done; i++)   ret=((ret << 8) & 0xffffffff) + (p[i] & 0xff);
      return ret;
    }
}
