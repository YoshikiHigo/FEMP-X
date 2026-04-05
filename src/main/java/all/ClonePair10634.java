package all;

public class ClonePair10634 {

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
