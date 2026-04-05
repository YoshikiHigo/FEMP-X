package all;

public class ClonePair7967 {

    int method1(int a,int b){
      if (a <= 0)   return b;
      if (b <= 0)   return a;
      return Math.min(a,b);
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
