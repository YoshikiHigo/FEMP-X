package unverified;

public class ClonePair4413 {

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
