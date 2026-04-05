package unverified;

public class ClonePair5849 {

    boolean method1(byte[] a,int aOff,byte[] b,int bOff,int len){
      if ((a.length < aOff + len) || (b.length < bOff + len))   return false;
      for (int i=0; i < len; i++) {
        if (a[i + aOff] != b[i + bOff])     return false;
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
