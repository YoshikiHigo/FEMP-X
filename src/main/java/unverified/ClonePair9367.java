package unverified;

public class ClonePair9367 {

    int method1(int[] sn){
      int result=sn[0];
      for (int i=0; i < sn.length; i++) {
        if (result < sn[i])     result=sn[i];
      }
      return result;
    }

    int method2(int[] s){
      int mx=s[0];
      for (int k=1; k < s.length; ++k) {
        if (mx < s[k]) {
          mx=s[k];
        }
      }
      return mx;
    }
}
