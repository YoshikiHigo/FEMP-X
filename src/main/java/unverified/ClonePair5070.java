package unverified;

public class ClonePair5070 {

    boolean method1(int candidate){
      if (candidate < 2) {
        return false;
      }
      if (candidate == 2) {
        return true;
      }
      if (candidate % 2 == 0) {
        return false;
      }
      int factor=3;
      double square=Math.ceil(Math.sqrt(candidate));
      while (factor <= square) {
        if (candidate % factor == 0)     return false;
        factor+=2;
      }
      return true;
    }

    boolean method2(int n){
      if (n <= 2) {
        return n == 2;
      }
      if (n % 2 == 0) {
        return false;
      }
      for (int i=3, end=(int)Math.sqrt(n); i <= end; i+=2) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
}
