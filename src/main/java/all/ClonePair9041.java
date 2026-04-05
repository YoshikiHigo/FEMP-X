package all;

public class ClonePair9041 {

    int method1(int exponent){
      int res=1;
      if (exponent > 0) {
        for (int i=0; i < exponent; i++) {
          res*=2;
        }
      }
      return res;
    }

    int method2(int k){
      assert (k >= 0);
      int result=1;
      while (k > 0) {
        k--;
        result*=2;
      }
      return result;
    }
}
