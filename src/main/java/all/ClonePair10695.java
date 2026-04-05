package all;

public class ClonePair10695 {

    double method1(double angle){
      double a=angle;
      while (a > 180)   a-=360;
      while (a < -180)   a+=360;
      return a;
    }

    double method2(double lng){
      if (lng > 180.0) {
        while (lng > 180.0)     lng-=360.0;
      }
     else   if (lng < -180.0) {
        while (lng < -180.0)     lng+=360.0;
      }
      return lng;
    }
}
