package all;

public class ClonePair9155 {

    double method1(double angle){
      while (angle > 180.0)   angle-=360.0;
      while (angle < -180.0)   angle+=360.0;
      return (angle);
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
