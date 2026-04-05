package unverified;

public class ClonePair4421 {

    boolean method1(long n){
      boolean prime=true;
      for (long i=3; i <= Math.sqrt(n); i+=2)   if (n % i == 0) {
        prime=false;
        break;
      }
      if ((n % 2 != 0 && prime && n > 2) || n == 2) {
        return true;
      }
     else {
        return false;
      }
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
