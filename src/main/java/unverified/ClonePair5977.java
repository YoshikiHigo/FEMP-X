package unverified;

public class ClonePair5977 {

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

    int method2(int x,int y){
      int num=1;
      for (int i=0; i < y; i++)   num=num * x;
      return num;
    }
}
