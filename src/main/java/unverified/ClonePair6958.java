package unverified;

public class ClonePair6958 {

    int method1(int a1,int a2,int a3){
      if (a1 >= a2 && a1 >= a3) {
        return a1;
      }
     else   if (a2 >= a1 && a2 >= a3) {
        return a2;
      }
     else   return a3;
    }

    int method2(int a,int b,int c){
      if (a >= b && a >= c)   return a;
     else   if (b >= c && b >= a)   return b;
     else   return c;
    }
}
