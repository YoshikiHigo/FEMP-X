package all;

public class ClonePair12294 {

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

    long method2(long dur,long time){
      long ntime=time + dur;
      if (ntime >= 0 && time < 0 && dur < 0) {
        ntime=Long.MIN_VALUE;
      }
     else   if (ntime < 0 && time > 0 && dur > 0) {
        ntime=Long.MAX_VALUE;
      }
      return ntime;
    }
}
