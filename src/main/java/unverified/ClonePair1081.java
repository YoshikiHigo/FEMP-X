package unverified;

public class ClonePair1081 {

    boolean method1(byte[] tok,byte[] tok2){
      final int tl=tok2.length;
      if (tl != tok.length)   return false;
      for (int t=0; t != tl; t++)   if (tok2[t] != tok[t])   return false;
      return true;
    }

    boolean method2(byte[] d1,byte[] d2){
      if (d1.length != d2.length) {
        return false;
      }
      for (int i=0; i < d1.length; i++) {
        if (d1[i] != d2[i])     return false;
      }
      return true;
    }
}
