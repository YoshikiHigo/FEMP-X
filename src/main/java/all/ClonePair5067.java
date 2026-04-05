package all;

public class ClonePair5067 {

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
      if (n <= 0 || n == 1) {
        return false;
      }
     else   if (n == 2) {
        return true;
      }
     else {
        int i=2;
        while (i < n) {
          if ((n % i) == 0) {
            return false;
          }
          i++;
        }
        return true;
      }
    }
}
