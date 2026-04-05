package unverified;

public class ClonePair9002 {

    double method1(double lon){
      double times;
      if (lon >= -180.0 && lon <= 180.0) {
        return (lon);
      }
     else {
        times=Math.floor((Math.abs(lon) + 180.0) / 360.0);
        if (lon < 0.0) {
          return (lon + 360.0 * times);
        }
     else {
          return (lon - 360.0 * times);
        }
      }
    }

    double method2(double p){
      double ps=p;
      while (ps > 180) {
        ps-=360;
      }
      while (ps < -180) {
        ps+=360;
      }
      return ps;
    }
}
