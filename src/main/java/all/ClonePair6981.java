package all;

public class ClonePair6981 {

    int method1(int n,int min,int max){
      if (n <= min)   return min;
      if (n >= max)   return max;
      return n;
    }

    int method2(int theInt,int minValue,int maxValue){
      int rangeInt=theInt;
      if (rangeInt < minValue) {
        rangeInt=minValue;
      }
     else   if (rangeInt > maxValue) {
        rangeInt=maxValue;
      }
      return rangeInt;
    }
}
