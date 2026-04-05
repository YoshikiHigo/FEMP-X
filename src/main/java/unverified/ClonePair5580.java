package unverified;

public class ClonePair5580 {

    int method1(int x,int n){
      int y=x % n;
      if (y < 0) {
        y+=n;
      }
      return y;
    }

    int method2(int a,int b){
      int n=a / b;
      int result=a - n * b;
      if (result < 0)   return result + b;
      return result;
    }
}
