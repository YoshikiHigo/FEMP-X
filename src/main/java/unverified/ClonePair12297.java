package unverified;

public class ClonePair12297 {

    long method1(long a,long b){
      long s=a + b;
      if (b >= 0)   return s >= a ? s : Long.MAX_VALUE;
      return s < a ? s : Long.MIN_VALUE;
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
