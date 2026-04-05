package unverified;

public class ClonePair4415 {

    boolean method1(long testNumber){
      if (testNumber < 2)   return false;
      if (testNumber == 2)   return true;
      if (testNumber % 2 == 0)   return false;
      long upperBorder=(long)Math.round(Math.sqrt(testNumber));
      for (long i=3; i <= upperBorder; i=i + 2)   if (testNumber % i == 0)   return false;
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
