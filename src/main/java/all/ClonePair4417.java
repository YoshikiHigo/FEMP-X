package all;

public class ClonePair4417 {

    boolean method1(long testNumber){
      if (testNumber < 2)   return false;
      if (testNumber == 2)   return true;
      if (testNumber % 2 == 0)   return false;
      long upperBorder=(long)Math.round(Math.sqrt(testNumber));
      for (long i=3; i <= upperBorder; i=i + 2)   if (testNumber % i == 0)   return false;
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
