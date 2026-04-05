package all;

public class ClonePair5983 {

    int method1(int n,int k){
      assert (n >= 0) && (k >= 0);
      if (k == 0) {
        return 1;
      }
     else   if (n == 0) {
        return 0;
      }
     else {
        int accum=1;
        for (int i=0; i < k; i++) {
          assert (accum > 0) && ((n * accum) > 0);
          accum=n * accum;
        }
        return accum;
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
