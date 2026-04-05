package all;

public class ClonePair4410 {

    boolean method1(long number){
      if (number < 2)   return false;
      if (number == 2)   return true;
      if (number % 2 == 0)   return false;
      if (number == 3)   return true;
      if (number % 3 == 0)   return false;
      int y=2;
      int x=(int)Math.sqrt(number);
      for (int i=5; i <= x; i+=y, y=6 - y) {
        if (number % i == 0)     return false;
      }
      return true;
    }

    boolean method2(long n){
      if (n == 2)   return true;
      if (n < 0 || n % 2 == 0) {
        return false;
      }
      long d=3;
      long s=(long)Math.ceil(Math.sqrt(n));
      while (d <= s) {
        if (n % d == 0)     return false;
        d+=2;
      }
      return true;
    }
}
