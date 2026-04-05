package unverified;

public class ClonePair7022 {

    int method1(int val,int min,int max){
      if (val < min)   return min;
      if (val > max)   return max;
      return val;
    }

    int method2(int value,int lower,int upper){
      if (value < lower)   value=lower;
     else   if (value > upper)   value=upper;
      return value;
    }
}
