package all;

import java.util.Arrays;

public class ClonePair1092 {

    boolean method1(byte[] tok,byte[] tok2){
      final int tl=tok2.length;
      if (tl != tok.length)   return false;
      for (int t=0; t != tl; t++)   if (tok2[t] != tok[t])   return false;
      return true;
    }

    boolean method2(byte[] sumR,byte[] sumL){
      System.out.println("==" + sumL.length + "=="+ sumR.length);
      System.out.println(">" + Arrays.toString(sumR));
      System.out.println(">" + Arrays.toString(sumL));
      if (sumR.length == sumL.length) {
        for (int i=0; i < sumR.length; i++)     if (sumR[i] != sumL[i])     return false;
        return true;
      }
      return false;
    }
}
