package all;

public class ClonePair108 {

    double method1(double y0,double y1,double y2){
      if ((y0 <= y1) && (y0 <= y2)) {
        return y0;
      }
     else   if (y1 <= y2) {
        return y1;
      }
     else {
        return y2;
      }
    }

    double method2(double e1,double e2,double e3){
      double min=e1;
      if (e2 < min) {
        min=e2;
      }
      if (e3 < min) {
        min=e3;
      }
      return min;
    }
}
