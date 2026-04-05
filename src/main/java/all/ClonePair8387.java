package all;

public class ClonePair8387 {

    boolean method1(byte[] dstBuf,byte[] srcBuf,int len){
      for (int i=0; i < len; i++)   if (dstBuf[i] != srcBuf[i])   return false;
      return true;
    }

    boolean method2(byte[] s1,byte[] s2,int n){
      int c=0;
      byte u1, u2;
      while (c < n) {
        u1=s1[c];
        u2=s2[c];
        if (u1 >= 'A')     u1=(byte)(u1 - 'A' + 'a');
        if (u2 >= 'A')     u2=(byte)(u2 - 'A' + 'a');
        if (u1 != u2) {
          return false;
        }
        c++;
      }
      return true;
    }
}
