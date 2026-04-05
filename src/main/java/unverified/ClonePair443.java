package unverified;

import java.util.Arrays;

public class ClonePair443 {

    boolean method1(byte[] a,byte[] b){
      if (a.length == b.length) {
        for (int i=0; i < a.length; i++) {
          if (a[i] != b[i])       return false;
        }
        return true;
      }
      return false;
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
