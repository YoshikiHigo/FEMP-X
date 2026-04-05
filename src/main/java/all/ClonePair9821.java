package all;

public class ClonePair9821 {

    int method1(int[] v){
      int max=v[0];
      for (int i=1; i < v.length; i++) {
        if (max < v[i]) {
          max=v[i];
        }
      }
      return (max);
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
