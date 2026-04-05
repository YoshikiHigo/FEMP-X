package all;

public class ClonePair4868 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int x,int n){
      int y=x % n;
      if (y < 0) {
        y+=n;
      }
      return y;
    }
}
