package all;

public class ClonePair4407 {

    boolean method1(long b){
      if (b == 2) {
        return true;
      }
      if ((b & 1L) == 0) {
        return false;
      }
      long maxlen=((long)Math.sqrt(b)) + 2;
      for (long x=3; x < maxlen; x+=2) {
        if (b % x == 0) {
          return false;
        }
      }
      return true;
    }

    boolean method2(long n){
      if (n == 2)   return true;
      if (n % 2 == 0)   return false;
      long raiz=(long)Math.sqrt(n);
      boolean ok=true;
      for (long div=3; div <= raiz; div+=2) {
        if (n % div == 0)     return false;
      }
      return true;
    }
}
