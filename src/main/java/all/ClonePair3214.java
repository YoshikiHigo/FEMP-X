package all;

public class ClonePair3214 {

    boolean method1(byte[] aBytes,int nOffset,byte[] aCmpBytes){
      final int nEnd=aCmpBytes.length;
      for (int i=0; i < nEnd; ++i)   if (aCmpBytes[i] != aBytes[nOffset + i])   return false;
      return true;
    }

    boolean method2(byte[] a,int offset,byte[] b){
      for (int i=0; i < b.length; i++)   if (a[offset + i] != b[i])   return false;
      return true;
    }
}
