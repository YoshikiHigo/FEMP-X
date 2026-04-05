package all;

public class ClonePair4422 {

    boolean method1(long n){
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

    boolean method2(long number){
      if (number == 2 || number == 3)   return true;
      if (number < 2 || (number & 1) == 0)   return false;
      if (number < 9)   return true;
      if (number % 3 == 0)   return false;
      long r=(long)Math.sqrt(number);
      long f=5;
      while (f <= r) {
        if (number % f == 0 || number % (f + 2) == 0)     return false;
        f+=6;
      }
      return true;
    }
}
