package unverified;

public class ClonePair5861 {

    boolean method1(byte[] b1,int nOffset1,byte[] b2,int nOffset2,int nLength){
      if (nOffset1 + nLength > b1.length || nOffset2 + nLength > b2.length)   return false;
      for (int i=0; i < nLength; i++) {
        if (b1[nOffset1 + i] != b2[nOffset2 + i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,int aOffset,byte[] b,int bOffset,int length){
      if ((a.length < aOffset + length) || (b.length < bOffset + length)) {
        return false;
      }
      for (int i=0; i < length; i++) {
        if (a[aOffset + i] != b[bOffset + i]) {
          return false;
        }
      }
      return true;
    }
}
