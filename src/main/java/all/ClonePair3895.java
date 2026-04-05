package all;

public class ClonePair3895 {

    double method1(double x,double y){
      double a;
      if (x != 0.0) {
        if (y != 0.0)     a=Math.atan(y / x);
     else     a=(x < 0.0) ? Math.PI : 0.0;
      }
     else   a=(y < 0.0) ? -Math.PI / 2 : Math.PI / 2;
      if (a < 0.0)   a+=Math.PI;
      if (y < 0.0)   a+=Math.PI;
      return a;
    }

    double method2(double xCoordinate,double yCoordinate){
      double result;
      if (xCoordinate == 0) {
        if (yCoordinate < 0) {
          result=3 * Math.PI / 2;
        }
     else {
          result=Math.PI / 2;
        }
      }
     else {
        result=Math.atan(yCoordinate / xCoordinate);
        if (xCoordinate < 0) {
          result=Math.PI + result;
        }
     else     if (xCoordinate > 0 && yCoordinate < 0) {
          result=2 * Math.PI + result;
        }
      }
      return result;
    }
}
