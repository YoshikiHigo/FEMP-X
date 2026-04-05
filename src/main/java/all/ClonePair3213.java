package all;

public class ClonePair3213 {

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

    boolean method2(byte[] src,int srcOffset,byte[] cmp){
      for (int i=0; i < cmp.length; i++) {
        if (src[srcOffset + i] != cmp[i]) {
          return false;
        }
      }
      return true;
    }
}
