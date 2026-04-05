package all;

public class ClonePair2165 {

    boolean method1(byte[] target,byte[] prefix){
      final int testlen=prefix.length;
      if (target.length < testlen) {
        return false;
      }
      for (int i=0; i < testlen; i++) {
        if (target[i] != prefix[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] tok,byte[] sub){
      final int sl=sub.length;
      if (sl > tok.length)   return false;
      for (int s=0; s < sl; s++)   if (sub[s] != tok[s])   return false;
      return true;
    }
}
