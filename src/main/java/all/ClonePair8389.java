package all;

public class ClonePair8389 {

    boolean method1(byte[] dstBuf,byte[] srcBuf,int len){
      for (int i=0; i < len; i++)   if (dstBuf[i] != srcBuf[i])   return false;
      return true;
    }

    boolean method2(byte[] b1,byte[] b2,int len){
      for (int i=0; i < len; ++i) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
    }
}
