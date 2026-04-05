package all;

public class ClonePair6805 {

    int method1(int x,int y){
      int num=1;
      for (int i=0; i < y; i++)   num=num * x;
      return num;
    }

    int method2(int base,int exponent){
      assert exponent >= 0;
      int result=1;
      for (int i=0; i < exponent; i++) {
        result*=base;
      }
      return result;
    }
}
