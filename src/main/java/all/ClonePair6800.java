package all;

public class ClonePair6800 {

    boolean method1(int[] charBarWidths,int[] candidate,int n){
      for (int i=0; i < n; i++) {
        if (charBarWidths[i] != candidate[i])     return false;
      }
      return true;
    }

    boolean method2(int[] v1,int[] v2,int len){
      for (int i=0; i < len; i++)   if (v1[i] != v2[i])   return false;
      return true;
    }
}
