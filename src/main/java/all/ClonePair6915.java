package all;

public class ClonePair6915 {

    int method1(int a,int b,int c){
      int minimum=a;
      if (b < minimum) {
        minimum=b;
      }
      if (c < minimum) {
        minimum=c;
      }
      return minimum;
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
