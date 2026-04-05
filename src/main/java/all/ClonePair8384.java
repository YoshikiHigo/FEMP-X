package all;

public class ClonePair8384 {

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

    boolean method2(byte[] pat,byte[] in,int idx){
      if ((idx + pat.length) > in.length)   return false;
      for (int i=0; i < pat.length; i++)   if (pat[i] != in[i + idx])   return false;
     else   ;
      return true;
    }
}
