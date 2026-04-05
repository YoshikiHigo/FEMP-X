package unverified;

public class ClonePair4423 {

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

    boolean method2(long n){
      if (n < 2)   return false;
      if (n == 2 || n == 3)   return true;
      if (n % 2 == 0 || n % 3 == 0)   return false;
      long sqrtN=(long)Math.sqrt(n) + 1;
      for (long i=6L; i <= sqrtN; i+=6) {
        if (n % (i - 1) == 0 || n % (i + 1) == 0)     return false;
      }
      return true;
    }
}
