package all;

public class ClonePair5511 {

    int method1(int value,int maxSize){
      if (value < 0) {
        value=(((-value / maxSize) + 1) * maxSize) + value;
      }
     else   if (value >= maxSize) {
        value=(value - ((value / maxSize) * maxSize));
      }
      return value;
    }

    int method2(int x,int n){
      int y=x % n;
      if (y < 0) {
        y+=n;
      }
      return y;
    }
}
