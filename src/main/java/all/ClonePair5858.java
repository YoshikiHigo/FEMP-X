package all;

public class ClonePair5858 {

    boolean method1(byte[] buf1,int off1,byte[] buf2,int off2,int len){
      if ((off1 + len > buf1.length) || (off2 + len > buf2.length)) {
        return false;
      }
      for (int i=0; i < len; i++) {
        if (buf1[off1 + i] != buf2[off2 + i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] b1,int nOffset1,byte[] b2,int nOffset2,int nLength){
      if (nOffset1 + nLength > b1.length || nOffset2 + nLength > b2.length)   return false;
      for (int i=0; i < nLength; i++) {
        if (b1[nOffset1 + i] != b2[nOffset2 + i])     return false;
      }
      return true;
    }
}
