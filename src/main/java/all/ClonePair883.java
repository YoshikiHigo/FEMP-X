package all;

public class ClonePair883 {

    boolean method1(byte[] b1,byte[] b2){
      if (b1.length != b2.length) {
        System.out.println("Compare failed: lengths differ");
        return false;
      }
      for (int i=0; i < b1.length; i++) {
        if (b1[i] != b2[i]) {
          System.out.println("Compare failed: bytes at " + i + " differ ["+ b1[i]+ "] ["+ b2[i]+ "]");
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
