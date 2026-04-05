package unverified;

import java.util.Arrays;

public class ClonePair2299 {

    boolean method1(byte[] array1,byte[] array2){
      if (array1.length != array2.length) {
        return false;
      }
      int len=array1.length;
      for (int i=0; i < len; i++) {
        if (array1[i] != array2[i]) {
          return false;
        }
      }
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
