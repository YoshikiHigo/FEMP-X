package unverified;

public class ClonePair5513 {

    int method1(int value,int maxSize){
      if (value < 0) {
        value=(((-value / maxSize) + 1) * maxSize) + value;
      }
     else   if (value >= maxSize) {
        value=(value - ((value / maxSize) * maxSize));
      }
      return value;
    }

    int method2(int x,int width){
      if (x >= 0 && x < width)   return x;
      x=x % width;
      if (x < 0)   x+=width;
      return x;
    }
}
