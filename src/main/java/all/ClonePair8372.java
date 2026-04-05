package all;

public class ClonePair8372 {

    boolean method1(byte[] d1,byte[] d2,int o){
      for (int i=0; i < d1.length; i++) {
        if (i + o >= d2.length)     return false;
        if (d1[i] != d2[o + i])     return false;
      }
      return true;
    }

    boolean method2(byte[] val,byte[] msg,int off){
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
}
