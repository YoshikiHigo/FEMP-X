package all;

public class ClonePair7002 {

    int method1(int secondsComponent,int hangTime,int minHangTime){
      int nextCheckSeconds=hangTime;
      if (secondsComponent < hangTime) {
        if (secondsComponent < minHangTime)     secondsComponent=minHangTime;
        nextCheckSeconds=secondsComponent;
      }
      return nextCheckSeconds;
    }

    int method2(int min,int max,int val){
      if (val >= min && val <= max)   return val;
      if (val < min)   return min;
      if (val > max)   return max;
      return val;
    }
}
