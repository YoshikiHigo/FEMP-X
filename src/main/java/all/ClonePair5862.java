package all;

public class ClonePair5862 {

    boolean method1(byte[] b1,int nOffset1,byte[] b2,int nOffset2,int nLength){
      if (nOffset1 + nLength > b1.length || nOffset2 + nLength > b2.length)   return false;
      for (int i=0; i < nLength; i++) {
        if (b1[nOffset1 + i] != b2[nOffset2 + i])     return false;
      }
      return true;
    }

    boolean method2(byte[] a,int i,byte[] b,int j,int n){
      if (a.length < i + n || b.length < j + n)   return false;
      while (--n >= 0)   if (a[i++] != b[j++])   return false;
      return true;
    }
}
