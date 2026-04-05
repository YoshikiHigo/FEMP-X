package all;

public class ClonePair5524 {

    int method1(int value,int maxSize){
      if (value < 0) {
        value=(((-value / maxSize) + 1) * maxSize) + value;
      }
     else   if (value >= maxSize) {
        value=(value - ((value / maxSize) * maxSize));
      }
      return value;
    }

    int method2(int D,int d){
      int R=0;
      int C=D / d;
      if (D < 0)   R=D + (1 - C) * d;
     else   R=D - C * d;
      return R;
    }
}
