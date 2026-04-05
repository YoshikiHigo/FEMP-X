package unverified;

public class ClonePair5931 {

    int method1(int a,int p){
      assert p >= 0;
      if (p == 0) {
        return 1;
      }
     else {
        int result=a;
        for (int i=1; i < p; ++i) {
          result=a * result;
        }
        return result;
      }
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
