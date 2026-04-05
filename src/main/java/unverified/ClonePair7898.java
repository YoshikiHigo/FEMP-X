package unverified;

public class ClonePair7898 {

    int method1(int m,int n){
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

    int method2(int a,int b){
      while (a != b) {
        if (a > b) {
          a=a - b;
        }
     else {
          b=b - a;
        }
      }
      return a;
    }
}
