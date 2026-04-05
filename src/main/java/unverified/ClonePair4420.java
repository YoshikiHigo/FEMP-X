package unverified;

public class ClonePair4420 {

    boolean method1(long n){
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
