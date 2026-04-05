package unverified;

public class ClonePair10632 {

    double method1(double lng){
      int k=(int)Math.abs((lng / 360));
      if (lng > 180.0) {
        lng-=k * 360;
        if (lng > 180.0)     lng-=360.0;
      }
     else   if (lng < -180.0) {
        lng+=k * 360;
        if (lng < -180.0)     lng+=360.0;
      }
      return lng;
    }

    double method2(double angle){
      double a=angle;
      while (a > 180)   a-=360;
      while (a < -180)   a+=360;
      return a;
    }
}
