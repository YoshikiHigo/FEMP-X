package unverified;

public class ClonePair4427 {

    boolean method1(long number){
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
