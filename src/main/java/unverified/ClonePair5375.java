package unverified;

public class ClonePair5375 {

    boolean method1(int i){
      if (i == 2)   return true;
      if (i < 2 || i % 2 == 0)   return false;
      for (int stop=i, j=3; j < stop; stop=i / j, j+=2)   if (i % j == 0)   return false;
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
