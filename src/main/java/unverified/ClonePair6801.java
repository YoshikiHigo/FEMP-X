package unverified;

public class ClonePair6801 {

    boolean method1(int[] charBarWidths,int[] candidate,int n){
      for (int i=0; i < n; i++) {
        if (charBarWidths[i] != candidate[i])     return false;
      }
      return true;
    }

    boolean method2(int[] data,int[] data2,int len){
      for (int i=0; i < len; i++) {
        if (data[i] != data2[i]) {
          return false;
        }
      }
      return true;
    }
}
