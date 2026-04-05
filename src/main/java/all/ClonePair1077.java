package all;

public class ClonePair1077 {

    boolean method1(byte[] tok,byte[] tok2){
      final int tl=tok2.length;
      if (tl != tok.length)   return false;
      for (int t=0; t != tl; t++)   if (tok2[t] != tok[t])   return false;
      return true;
    }

    boolean method2(byte[] b1,byte[] b2){
      boolean ret=b1.length == b2.length;
      for (int i=0; ret && i < b1.length; i++) {
        ret=b1[i] == b2[i];
      }
      return ret;
    }
}
