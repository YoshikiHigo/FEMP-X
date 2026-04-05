package unverified;

public class ClonePair292 {

    boolean method1(byte[] b1,byte[] b2){
      int size1=b1.length;
      int size2=b2.length;
      if (size1 != size2) {
        return false;
      }
      for (int i=0; i < size1; i++) {
        if (b1[i] != b2[i]) {
          return false;
        }
      }
      return true;
    }

    boolean method2(byte[] tok,byte[] tok2){
      final int tl=tok2.length;
      if (tl != tok.length)   return false;
      for (int t=0; t != tl; t++)   if (tok2[t] != tok[t])   return false;
      return true;
    }
}
