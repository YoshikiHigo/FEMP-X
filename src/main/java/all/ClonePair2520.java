package all;

public class ClonePair2520 {

    long method1(long size,float ratio,int multiplier){
      if (size != 0 && ratio != 0 && multiplier != 0) {
        return (long)((size * ratio) + (size * (multiplier - 1)));
      }
     else {
        return 0L;
      }
    }

    long method2(long size,float ratio,int multiplier){
      if (size != 0 && ratio != 0 && multiplier != 0) {
        return (long)((size * ratio) + (size * (multiplier - 1)));
      }
      return 0L;
    }
}
