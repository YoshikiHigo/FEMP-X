package unverified;

public class ClonePair10669 {

    double method1(double p){
      double ps=p;
      while (ps > 180) {
        ps-=360;
      }
      while (ps < -180) {
        ps+=360;
      }
      return ps;
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
