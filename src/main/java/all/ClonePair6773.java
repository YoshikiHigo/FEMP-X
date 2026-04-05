package all;

public class ClonePair6773 {

    int method1(int a,int b,int c){
      int ma;
      ma=a;
      if (b > ma) {
        ma=b;
      }
      if (c > ma) {
        ma=c;
      }
      return ma;
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
