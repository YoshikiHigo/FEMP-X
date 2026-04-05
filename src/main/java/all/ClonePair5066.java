package all;

public class ClonePair5066 {

    boolean method1(int candidate){
      if (candidate < 2) {
        return false;
      }
      if (candidate == 2) {
        return true;
      }
      if (candidate % 2 == 0) {
        return false;
      }
      int factor=3;
      double square=Math.ceil(Math.sqrt(candidate));
      while (factor <= square) {
        if (candidate % factor == 0)     return false;
        factor+=2;
      }
      return true;
    }

    boolean method2(int number){
      if (number == 2 || number == 3)   return true;
      if (number < 2 || (number & 1) == 0)   return false;
      if (number < 9)   return true;
      if (number % 3 == 0)   return false;
      int r=(int)Math.sqrt(number);
      int f=5;
      while (f <= r) {
        if (number % f == 0 || number % (f + 2) == 0)     return false;
        f+=6;
      }
      return true;
    }
}
