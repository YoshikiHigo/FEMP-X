package unverified;

public class ClonePair4486 {

    double method1(double x,double y){
      double h=Math.sqrt(x * x + y * y);
      double theta=Math.acos(Math.abs(x) / h);
      if (x <= 0 && y > 0)   theta=Math.PI - theta;
      if (x < 0 && y <= 0)   theta=Math.PI + theta;
      if (x >= 0 && y < 0)   theta=2 * Math.PI - theta;
      return theta;
    }

    double method2(double x,double y){
      double theta=Math.acos(x / Math.sqrt(x * x + y * y));
      if (x < 0 && y < 0) {
        theta=2.0 * Math.PI - theta;
      }
     else   if (x > 0 && y < 0) {
        theta=2.0 * Math.PI - theta;
      }
      return theta;
    }
}
