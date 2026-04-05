package unverified;

public class ClonePair12295 {

    long method1(long a,long b){
      if ((a ^ b) < 0) {
        return a + b;
      }
     else {
        long sum=a + b;
        if ((a ^ sum) < 0) {
          return (sum >= 0) ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
     else {
          return sum;
        }
      }
    }

    long method2(long a,long b){
      long s=a + b;
      if (b >= 0)   return s >= a ? s : Long.MAX_VALUE;
      return s < a ? s : Long.MIN_VALUE;
    }
}
