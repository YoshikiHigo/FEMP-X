package all;

public class ClonePair4425 {

    boolean method1(long n){
      if (n < 2)   return false;
      if (n == 2 || n == 3)   return true;
      if (n % 2 == 0 || n % 3 == 0)   return false;
      long sqrtN=(long)Math.sqrt(n) + 1;
      for (long i=6L; i <= sqrtN; i+=6) {
        if (n % (i - 1) == 0 || n % (i + 1) == 0)     return false;
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
