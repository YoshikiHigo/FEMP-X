package all;

public class ClonePair5310 {

    boolean method1(int n){
      if (n <= 0 || n == 1) {
        return false;
      }
     else   if (n == 2) {
        return true;
      }
     else {
        int i=2;
        while (i < n) {
          if ((n % i) == 0) {
            return false;
          }
          i++;
        }
        return true;
      }
    }

    boolean method2(int i){
      if (i == 2)   return true;
      if (i < 2 || i % 2 == 0)   return false;
      for (int stop=i, j=3; j < stop; stop=i / j, j+=2)   if (i % j == 0)   return false;
      return true;
    }
}
