package all;

public class ClonePair5534 {

    int method1(int value,int maxSize){
      if (value < 0) {
        value=(((-value / maxSize) + 1) * maxSize) + value;
      }
     else   if (value >= maxSize) {
        value=(value - ((value / maxSize) * maxSize));
      }
      return value;
    }

    int method2(int x,int y){
      x=x % y;
      if (x < 0) {
        x+=y;
      }
      return x;
    }
}
