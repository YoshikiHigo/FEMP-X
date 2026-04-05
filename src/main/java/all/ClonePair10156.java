package all;

public class ClonePair10156 {

    int method1(byte[] buf,int offs,int len){
      int ret=0;
      for (int i=0; i < len; i++) {
        int b=buf[offs + i];
        if (b < 0)     b+=256;
        ret=(ret << 8) + b;
      }
      return ret;
    }

    int method2(byte[] sbuf,int pos,int numBytes){
      int result=0;
      for (int i=0; i < numBytes; i++)   result=(result << 8) + (sbuf[pos + i] & 0xff);
      return result;
    }
}
