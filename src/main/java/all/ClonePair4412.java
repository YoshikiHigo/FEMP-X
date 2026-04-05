package all;

public class ClonePair4412 {

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
