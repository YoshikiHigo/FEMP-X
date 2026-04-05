package all;

public class ClonePair10668 {

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

    double method2(double angle){
      double a=angle;
      while (a > 180)   a-=360;
      while (a < -180)   a+=360;
      return a;
    }
}
