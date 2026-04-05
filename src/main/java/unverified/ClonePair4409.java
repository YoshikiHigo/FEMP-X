package unverified;

public class ClonePair4409 {

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
