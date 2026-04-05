package all;

public class ClonePair6337 {

    int method1(int a,int b){
      int n=a / b;
      int result=a - n * b;
      if (result < 0)   return result + b;
      return result;
    }

    int method2(int x,int y){
      x=x % y;
      if (x < 0) {
        x+=y;
      }
      return x;
    }
}
