package unverified;

public class ClonePair8373 {

    boolean method1(byte[] d1,byte[] d2,int o){
      for (int i=0; i < d1.length; i++) {
        if (i + o >= d2.length)     return false;
        if (d1[i] != d2[o + i])     return false;
      }
      return true;
    }

    boolean method2(byte[] base,byte[] target,int startIndex){
      if (target.length < base.length + startIndex) {
        return false;
      }
      for (int i=0; i < base.length; i++) {
        if (base[i] != target[i + startIndex]) {
          return false;
        }
      }
      return true;
    }
}
