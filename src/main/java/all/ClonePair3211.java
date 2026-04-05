package all;

public class ClonePair3211 {

    boolean method1(byte[] bytes,int start,byte[] subBytes){
      for (int i=0; i < subBytes.length; ) {
        if (bytes[start++] != subBytes[i++]) {
          return false;
        }
      }
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
