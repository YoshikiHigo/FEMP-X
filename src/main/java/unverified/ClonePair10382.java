package unverified;

public class ClonePair10382 {

    double method1(double d){
      if (d > Math.PI) {
        d-=Math.PI * 2;
      }
     else   if (d < -Math.PI) {
        d+=Math.PI * 2;
      }
      return d;
    }

    double method2(double theta){
      if (theta < -Math.PI)   return theta + 2 * Math.PI;
      if (theta > Math.PI)   return theta - 2 * Math.PI;
      return theta;
    }
}
