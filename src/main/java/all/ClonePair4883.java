package all;

public class ClonePair4883 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int a,int b){
      int res=a % b;
      if (res < 0 && b > 0) {
        res+=b;
      }
      return res;
    }
}
