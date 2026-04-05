package all;

public class ClonePair6696 {

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

    int method2(int value,int lower,int upper){
      if (value < lower)   value=lower;
     else   if (value > upper)   value=upper;
      return value;
    }
}
