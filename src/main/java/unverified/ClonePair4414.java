package unverified;

public class ClonePair4414 {

    boolean method1(long testNumber){
      if (testNumber < 2)   return false;
      if (testNumber == 2)   return true;
      if (testNumber % 2 == 0)   return false;
      long upperBorder=(long)Math.round(Math.sqrt(testNumber));
      for (long i=3; i <= upperBorder; i=i + 2)   if (testNumber % i == 0)   return false;
      return true;
    }

    boolean method2(long n){
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
}
