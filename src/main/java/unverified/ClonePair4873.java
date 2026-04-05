package unverified;

public class ClonePair4873 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
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
