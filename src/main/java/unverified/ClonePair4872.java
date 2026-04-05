package unverified;

public class ClonePair4872 {

    int method1(int val,int size){
      if (val < 0 || val > size - 1) {
        while (val < 0)     val+=size;
        return val % size;
      }
      return val;
    }

    int method2(int D,int d){
      int R=0;
      int C=D / d;
      if (D < 0)   R=D + (1 - C) * d;
     else   R=D - C * d;
      return R;
    }
}
