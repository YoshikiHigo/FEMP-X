package all;

public class ClonePair5317 {

    boolean method1(int n){
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

    boolean method2(int n){
      if (n <= 2)   return n == 2;
      if (n % 2 == 0)   return false;
      for (int i=3, end=(int)Math.sqrt(n); i <= end; i+=2) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
}
