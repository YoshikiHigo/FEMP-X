package all;

public class ClonePair7878 {

    int method1(int x,int y){
      int ax=x;
      if (ax < 0)   ax=-ax;
      if (ax < 0)   return y;
      int ay=y;
      if (ay < 0)   ay=-ay;
      if (ay < 0)   return x;
      if (ax < ay)   return x;
      if (ax > ay)   return y;
      return x < y ? x : y;
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
