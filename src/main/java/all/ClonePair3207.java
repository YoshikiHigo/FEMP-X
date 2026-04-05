package all;

public class ClonePair3207 {

    boolean method1(byte[] bytes,int start,byte[] subBytes){
      for (int i=0; i < subBytes.length; ) {
        if (bytes[start++] != subBytes[i++]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] aBytes,int nOffset,byte[] aCmpBytes){
      final int nEnd=aCmpBytes.length;
      for (int i=0; i < nEnd; ++i)   if (aCmpBytes[i] != aBytes[nOffset + i])   return false;
      return true;
    }
}
