package all;

public class ClonePair5388 {

    boolean method1(int ascii){
      if (ascii > 0 && ascii < 160) {
        return true;
      }
      return false;
    }

    boolean method2(int n){
      if (n <= 0) {
        return false;
      }
      if (n == 1) {
        return true;
      }
      int i=1;
      while (i < n) {
        i*=2;
      }
      return i == n;
    }
}
