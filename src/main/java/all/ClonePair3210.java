package all;

public class ClonePair3210 {

    boolean method1(byte[] src,int srcOff,byte[] bound){
      int j=srcOff;
      for (int i=0; i < bound.length; i++) {
        if (src[j] != bound[i]) {
          return false;
        }
        j++;
      }
      return true;
    }

    boolean method2(byte[] aBytes,int nOffset,byte[] aCmpBytes){
      final int nEnd=aCmpBytes.length;
      for (int i=0; i < nEnd; ++i)   if (aCmpBytes[i] != aBytes[nOffset + i])   return false;
      return true;
    }
}
