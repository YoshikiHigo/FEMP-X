package all;

public class ClonePair6770 {

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
      if (a >= b && a >= c)   return a;
     else   if (b >= c && b >= a)   return b;
     else   return c;
    }
}
