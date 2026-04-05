package all;

public class ClonePair4489 {

    double method1(double xDiff,double yDiff){
      double angle=0;
      if ((xDiff >= 0) && (yDiff >= 0)) {
        angle=Math.atan(yDiff / xDiff);
      }
     else   if ((xDiff < 0) && (yDiff >= 0)) {
        angle=Math.PI + Math.atan(yDiff / xDiff);
      }
     else   if ((xDiff < 0) && (yDiff < 0)) {
        angle=Math.PI + Math.atan(yDiff / xDiff);
      }
     else   if ((xDiff >= 0) && (yDiff < 0)) {
        angle=(2 * Math.PI) + Math.atan(yDiff / xDiff);
      }
      return angle;
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
