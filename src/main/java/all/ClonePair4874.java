package all;

public class ClonePair4874 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int x,int y){
      x=x % y;
      if (x < 0) {
        x+=y;
      }
      return x;
    }
}
