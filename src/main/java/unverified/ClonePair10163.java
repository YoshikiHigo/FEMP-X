package unverified;

public class ClonePair10163 {

    int method1(byte[] buf,int offs,int len){
      int ret=0;
      for (int i=0; i < len; i++) {
        int b=buf[offs + i];
        if (b < 0)     b+=256;
        ret=(ret << 8) + b;
      }
      return ret;
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
