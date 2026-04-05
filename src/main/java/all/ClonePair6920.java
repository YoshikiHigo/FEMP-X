package all;

public class ClonePair6920 {

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
      if (a >= b && a >= c)   return a;
     else   if (b >= c && b >= a)   return b;
     else   return c;
    }
}
