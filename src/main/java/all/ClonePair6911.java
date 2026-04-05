package all;

public class ClonePair6911 {

    int method1(int x,int y,int z){
      if (x > y)   if (x > z)   return x;
     else   return z;
     else   if (y > z)   return y;
     else   return z;
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
