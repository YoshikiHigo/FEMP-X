package all;

public class ClonePair4411 {

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
