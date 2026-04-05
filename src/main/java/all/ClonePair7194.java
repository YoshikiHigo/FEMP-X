package all;

public class ClonePair7194 {

    int method1(int value){
      if (value < 1) {
        return value;
      }
      int powerValue=1;
      for (; ; ) {
        powerValue*=2;
        if (value < powerValue) {
          int minBound=powerValue / 2;
          if ((powerValue - value) > (value - minBound)) {
            return minBound;
          }
     else {
            return powerValue;
          }
        }
      }
    }

    int method2(int value){
      if (value < 1)   return value;
      int powerValue=1;
      for (; ; ) {
        powerValue*=2;
        if (value < powerValue) {
          int minBound=powerValue / 2;
          if ((powerValue - value) > (value - minBound))       return minBound;
     else       return powerValue;
        }
      }
    }
}
