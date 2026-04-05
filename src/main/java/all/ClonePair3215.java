package all;

public class ClonePair3215 {

    boolean method1(byte[] aBytes,int nOffset,byte[] aCmpBytes){
      final int nEnd=aCmpBytes.length;
      for (int i=0; i < nEnd; ++i)   if (aCmpBytes[i] != aBytes[nOffset + i])   return false;
      return true;
    }

    boolean method2(byte[] src,int srcOffset,byte[] cmp){
      for (int i=0; i < cmp.length; i++) {
        if (src[srcOffset + i] != cmp[i]) {
          return false;
        }
      }
      return true;
    }
}
