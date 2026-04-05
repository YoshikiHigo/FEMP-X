package all;

public class ClonePair3952 {

    double method1(double xHaarResponse,double yHaarResponse){
      if (xHaarResponse >= 0 && yHaarResponse >= 0)   return Math.atan(yHaarResponse / xHaarResponse);
      if (xHaarResponse < 0 && yHaarResponse >= 0)   return Math.PI - Math.atan(-yHaarResponse / xHaarResponse);
      if (xHaarResponse < 0 && yHaarResponse < 0)   return Math.PI + Math.atan(yHaarResponse / xHaarResponse);
      if (xHaarResponse >= 0 && yHaarResponse < 0)   return 2 * Math.PI - Math.atan(-yHaarResponse / xHaarResponse);
      return 0;
    }

    double method2(double xDiff,double yDiff){
      double angle=0;
      if (xDiff >= 0 && yDiff >= 0) {
        angle=Math.atan(yDiff / xDiff);
      }
     else   if (xDiff < 0 && yDiff >= 0) {
        angle=Math.PI + Math.atan(yDiff / xDiff);
      }
     else   if (xDiff < 0 && yDiff < 0) {
        angle=Math.PI + Math.atan(yDiff / xDiff);
      }
     else   if (xDiff >= 0 && yDiff < 0) {
        angle=2 * Math.PI + Math.atan(yDiff / xDiff);
      }
      return angle;
    }
}
