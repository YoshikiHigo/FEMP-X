package unverified;

public class ClonePair6575 {

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

    int method2(int m,int n){
      if (n < 0) {
        n=-n;
      }
      if (m < n) {
        int t=m;
        m=n;
        n=t;
      }
      while (n != 0) {
        int r=m % n;
        m=n;
        n=r;
      }
      return m;
    }
}
