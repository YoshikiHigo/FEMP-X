package all;

public class ClonePair5688 {

    int method1(int base,int exponent){
      boolean reciprocal=false;
      if (exponent < 0) {
        reciprocal=true;
      }
      int result=1;
      while (exponent-- > 0) {
        result*=base;
      }
      return reciprocal ? 1 / result : result;
    }

    int method2(int x,int y){
      int num=1;
      for (int i=0; i < y; i++)   num=num * x;
      return num;
    }
}
