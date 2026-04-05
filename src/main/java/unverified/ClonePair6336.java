package unverified;

public class ClonePair6336 {

    int method1(int a,int b){
      int n=a / b;
      int result=a - n * b;
      if (result < 0)   return result + b;
      return result;
    }

    int method2(int x,int y){
      if (x >= 0) {
        return x % y;
      }
     else {
        int tmp=-x % y;
        return (tmp == 0) ? tmp : (y - tmp);
      }
    }
}
