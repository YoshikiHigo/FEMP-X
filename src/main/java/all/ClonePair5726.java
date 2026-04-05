package all;

public class ClonePair5726 {

    boolean method1(int n){
      if (n <= 2)   return n == 2;
      if (n % 2 == 0)   return false;
      for (int i=3, end=(int)Math.sqrt(n); i <= end; i+=2) {
        if (n % i == 0) {
          return false;
        }
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
