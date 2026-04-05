package unverified;

public class ClonePair4424 {

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

    boolean method2(long value){
      if (value == 2L) {
        return true;
      }
     else   if (value < 2 || value % 2 == 0) {
        return false;
      }
      final long three=3;
      final long root=(long)Math.sqrt(value);
      for (long i=three; i <= root; i+=2) {
        if (value % i == 0) {
          return false;
        }
      }
      return true;
    }
}
