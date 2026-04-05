package all;

public class ClonePair6844 {

    int method1(int a,int b,int c){
      if (a <= b && a <= c) {
        return a;
      }
      if (b <= a && b <= c) {
        return b;
      }
      return c;
    }

    int method2(int a,int b,int c){
      int minimum=a;
      if (b < minimum) {
        minimum=b;
      }
      if (c < minimum) {
        minimum=c;
      }
      return minimum;
    }
}
