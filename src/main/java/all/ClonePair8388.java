package all;

public class ClonePair8388 {

    boolean method1(byte[] dstBuf,byte[] srcBuf,int len){
      for (int i=0; i < len; i++)   if (dstBuf[i] != srcBuf[i])   return false;
      return true;
    }

    boolean method2(byte[] a,byte[] b,int len){
      for (int i=0; i < len; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}
