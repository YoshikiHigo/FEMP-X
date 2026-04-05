package unverified;

public class ClonePair4416 {

    boolean method1(long testNumber){
      if (testNumber < 2)   return false;
      if (testNumber == 2)   return true;
      if (testNumber % 2 == 0)   return false;
      long upperBorder=(long)Math.round(Math.sqrt(testNumber));
      for (long i=3; i <= upperBorder; i=i + 2)   if (testNumber % i == 0)   return false;
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
