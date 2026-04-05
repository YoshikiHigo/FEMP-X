package unverified;

public class ClonePair5722 {

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

    int method2(int base,int exponent){
      assert exponent >= 0;
      int result=1;
      for (int i=0; i < exponent; i++) {
        result*=base;
      }
      return result;
    }
}
