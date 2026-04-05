package unverified;

public class ClonePair3247 {

    boolean method1(int[] data1,int[] data2){
      if (data1.length != data2.length)   return false;
      for (int ctr=0; ctr < data1.length; ctr++) {
        if (data1[ctr] != data2[ctr])     return false;
      }
      return true;
    }

    boolean method2(int[] a1,int[] a2){
      if (a1.length != a2.length) {
        return false;
      }
      for (int i=0; i < a1.length; i++) {
        if (a1[i] != a2[i]) {
          return false;
        }
      }
      return true;
    }
}
