package all;

public class ClonePair6995 {

    int method1(int a,int b,int c){
      if ((a <= b) && (a <= c)) {
        return a;
      }
      if ((b <= a) && (b <= c)) {
        return b;
      }
      return c;
    }

    int method2(int i,int j,int k){
      if (i < j) {
        return (i < k) ? i : k;
      }
     else {
        return (j < k) ? j : k;
      }
    }
}
