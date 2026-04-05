package all;

public class ClonePair1734 {

    boolean method1(byte[] buf,byte[] magic){
      boolean match=true;
      for (int i=0; i < magic.length; i++) {
        if (buf[i] != magic[i]) {
          match=false;
          break;
        }
      }
      return match;
    }

    boolean method2(byte[] src,byte[] cmp){
      for (int i=0; i < cmp.length; i++) {
        if (src[i] != cmp[i]) {
          return false;
        }
      }
      return true;
    }
}
