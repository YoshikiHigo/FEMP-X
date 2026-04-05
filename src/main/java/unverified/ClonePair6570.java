package unverified;

public class ClonePair6570 {

    int method1(int a,int b){
      while (a != 0 && b != 0) {
        if (a >= b) {
          a=a % b;
        }
     else {
          b=b % a;
        }
      }
      return a + b;
    }

    int method2(int p,int q){
      int shift;
      if (p == 0 || q == 0)   return p | q;
      for (shift=0; ((p | q) & 1) == 0; ++shift) {
        p>>>=1;
        q>>>=1;
      }
      while ((p & 1) == 0)   p>>>=1;
      do {
        while ((q & 1) == 0)     q>>>=1;
        if (p < q)     q-=p;
     else {
          final int diff=p - q;
          p=q;
          q=diff;
        }
        q>>>=1;
      }
     while (q != 0);
      return p << shift;
    }
}
