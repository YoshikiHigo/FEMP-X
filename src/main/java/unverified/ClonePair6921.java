package unverified;

public class ClonePair6921 {

    int method1(int a,int b,int c){
      if (b > a) {
        a=b;
      }
      if (c > a) {
        a=c;
      }
      return a;
    }

    int method2(int a,int b,int c){
      int max=0;
      if ((a >= b) && (a >= c)) {
        max=a;
      }
     else   if ((b >= a) && (b >= c)) {
        max=b;
      }
     else {
        max=c;
      }
      return max;
    }
}
