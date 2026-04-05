package unverified;

public class ClonePair9152 {

    double method1(double angle){
      while (angle > 180.0)   angle-=360.0;
      while (angle < -180.0)   angle+=360.0;
      return (angle);
    }

    double method2(double lng){
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
}
