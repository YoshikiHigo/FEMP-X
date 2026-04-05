package unverified;

public class ClonePair6792 {

    int method1(int value,int min,int max){
      if (value > max) {
        return max;
      }
      if (value < min) {
        return min;
      }
      return value;
    }

    int method2(int value,int lower,int upper){
      if (value < lower)   value=lower;
     else   if (value > upper)   value=upper;
      return value;
    }
}
