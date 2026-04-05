package unverified;

public class ClonePair7018 {

    int method1(int val,int min,int max){
      if (val < min)   return min;
      if (val > max)   return max;
      return val;
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
