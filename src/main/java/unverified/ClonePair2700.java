package unverified;

import java.util.Arrays;

public class ClonePair2700 {

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

    boolean method2(byte[] name1,byte[] name2){
      if (name1.length != name2.length)   return false;
      if (name1 == name2)   return true;
      for (int i=name1.length; --i >= 0; )   if (name1[i] != name2[i])   return false;
      return true;
    }
}
