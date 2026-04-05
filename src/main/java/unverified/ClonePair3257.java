package unverified;

public class ClonePair3257 {

    boolean method1(int[] data1,int[] data2){
      if (data1.length != data2.length)   return false;
      for (int ctr=0; ctr < data1.length; ctr++) {
        if (data1[ctr] != data2[ctr])     return false;
      }
      return true;
    }

    boolean method2(int[] indices1,int[] indices2){
      if (indices1.length != indices2.length) {
        return false;
      }
      int len=indices1.length;
      int j;
      for (j=0; j < len; j++) {
        if (indices1[0] == indices2[j]) {
          break;
        }
      }
      if (j == len) {
        return false;
      }
      for (int i=1; i < len; i++) {
        if (indices1[i] != indices2[(j + i) % len]) {
          return false;
        }
      }
      return true;
    }
}
