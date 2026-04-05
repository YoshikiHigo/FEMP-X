package all;

public class ClonePair7999 {

    int method1(double x1,double y1,double x2,double y2,double px,double py){
      x2-=x1;
      y2-=y1;
      px-=x1;
      py-=y1;
      double t=px * y2 - py * x2;
      if (t == 0.0) {
        t=px * x2 + py * y2;
        if (t > 0.0) {
          px-=x2;
          py-=y2;
          t=px * x2 + py * y2;
          if (t < 0.0) {
            t=0.0;
          }
        }
      }
      return t < 0.0 ? -1 : (t > 0.0 ? 1 : 0);
    }

    int method2(double x1,double y1,double x2,double y2,double px,double py){
      x2-=x1;
      y2-=y1;
      px-=x1;
      py-=y1;
      double ccw=px * y2 - py * x2;
      if (ccw == 0.0) {
        ccw=px * x2 + py * y2;
        if (ccw > 0.0) {
          px-=x2;
          py-=y2;
          ccw=px * x2 + py * y2;
          if (ccw < 0.0) {
            ccw=0.0;
          }
        }
      }
      return (ccw < 0.0) ? -1 : ((ccw > 0.0) ? 1 : 0);
    }
}
