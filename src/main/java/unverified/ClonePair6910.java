package unverified;

public class ClonePair6910 {

    int method1(int x,int y,int z){
      if (x > y)   if (x > z)   return x;
     else   return z;
     else   if (y > z)   return y;
     else   return z;
    }

    int method2(int a,int b,int c){
      if (a >= b && a >= c)   return a;
     else   if (b >= c && b >= a)   return b;
     else   return c;
    }
}
