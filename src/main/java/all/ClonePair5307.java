package all;

public class ClonePair5307 {

    boolean method1(int number){
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

    boolean method2(int n){
      if (n <= 2)   return n == 2;
      if (n % 2 == 0)   return false;
      for (int i=3, end=(int)Math.sqrt(n); i <= end; i+=2) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
}
