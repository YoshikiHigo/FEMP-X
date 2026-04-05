package all;

public class ClonePair4419 {

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
