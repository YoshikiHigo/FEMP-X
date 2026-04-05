package all;

public class ClonePair6913 {

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

    int method2(int a,int b,int c){
      if (a <= b && a <= c)   return a;
     else   if (b <= c && b <= a)   return b;
     else   return c;
    }
}
