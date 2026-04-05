package all;

public class ClonePair8612 {

    double method1(double x1,double y1,double x2,double y2,double px,double py){
      x2-=x1;
      y2-=y1;
      px-=x1;
      py-=y1;
      double dotprod=px * x2 + py * y2;
      double projlenSq;
      if (dotprod <= 0.0) {
        projlenSq=0.0;
      }
     else {
        px=x2 - px;
        py=y2 - py;
        dotprod=px * x2 + py * y2;
        if (dotprod <= 0.0) {
          projlenSq=0.0;
        }
     else {
          projlenSq=dotprod * dotprod / (x2 * x2 + y2 * y2);
        }
      }
      double lenSq=px * px + py * py - projlenSq;
      if (lenSq < 0) {
        lenSq=0;
      }
      return lenSq;
    }

    double method2(double x1,double y1,double x2,double y2,double px,double py){
      x2-=x1;
      y2-=y1;
      px-=x1;
      py-=y1;
      double dist;
      if (px * x2 + py * y2 <= 0.0) {
        dist=px * px + py * py;
      }
     else {
        px=x2 - px;
        py=y2 - py;
        if (px * x2 + py * y2 <= 0.0) {
          dist=px * px + py * py;
        }
     else {
          dist=px * y2 - py * x2;
          dist=dist * dist / (x2 * x2 + y2 * y2);
        }
      }
      if (dist < 0) {
        dist=0;
      }
      return dist;
    }
}
