package all;

public class ClonePair8385 {

    boolean method1(byte[] base,byte[] target,int startIndex){
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

    boolean method2(byte[] pat,byte[] in,int idx){
      if ((idx + pat.length) > in.length)   return false;
      for (int i=0; i < pat.length; i++)   if (pat[i] != in[i + idx])   return false;
     else   ;
      return true;
    }
}
