package unverified;

public class ClonePair3208 {

    boolean method1(byte[] bytes,int start,byte[] subBytes){
      for (int i=0; i < subBytes.length; ) {
        if (bytes[start++] != subBytes[i++]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] src,int srcOff,byte[] bound){
      int j=srcOff;
      for (int i=0; i < bound.length; i++) {
        if (src[j] != bound[i]) {
          return false;
        }
        j++;
      }
      return true;
    }
}
