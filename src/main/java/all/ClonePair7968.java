package all;

public class ClonePair7968 {

    int method1(int m,int n){
      if (n < 0)   n=-n;
      if (m < n) {
        int tmp=m;
        m=n;
        n=tmp;
      }
      for (; ; )   if (n == 0)   return m;
     else   if (n == 1)   return n;
     else {
        int tmp=n;
        n=m % n;
        m=tmp;
      }
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
