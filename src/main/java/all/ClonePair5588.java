package all;

public class ClonePair5588 {

    int method1(int x,int n){
      int y=x % n;
      if (y < 0) {
        y+=n;
      }
      return y;
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
