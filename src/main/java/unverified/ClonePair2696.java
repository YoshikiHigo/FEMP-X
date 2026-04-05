package unverified;

import java.util.Arrays;

public class ClonePair2696 {

    boolean method1(byte[] sumR,byte[] sumL){
      System.out.println("==" + sumL.length + "=="+ sumR.length);
      System.out.println(">" + Arrays.toString(sumR));
      System.out.println(">" + Arrays.toString(sumL));
      if (sumR.length == sumL.length) {
        for (int i=0; i < sumR.length; i++)     if (sumR[i] != sumL[i])     return false;
        return true;
      }
      return false;
    }

    boolean method2(byte[] array1,byte[] array2){
      boolean same=true;
      int len1=array1.length;
      if (len1 == array2.length) {
        int i=0;
        while (i < len1 && same) {
          same=(array1[i] == array2[i]);
          i++;
        }
      }
     else {
        same=false;
      }
      return same;
    }
}
