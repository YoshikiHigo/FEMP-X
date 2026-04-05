package all;

public class ClonePair8383 {

    boolean method1(byte[] val,byte[] msg,int off){
      if (val.length + off > msg.length) {
        return false;
      }
      for (int i=0; i < val.length; i++) {
        if (val[i] != msg[i + off]) {
          return false;
        }
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
