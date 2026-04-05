package unverified;

public class ClonePair6695 {

    int method1(int val,int min,int max){
      if (val < min) {
        return min;
      }
     else   if (val > max) {
        return max;
      }
     else {
        return val;
      }
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
