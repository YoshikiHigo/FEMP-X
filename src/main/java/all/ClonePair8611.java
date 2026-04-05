package all;

public class ClonePair8611 {

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
      double pd2=(x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
      double x, y;
      if (pd2 == 0) {
        x=x1;
        y=y2;
      }
     else {
        double u=((px - x1) * (x2 - x1) + (py - y1) * (y2 - y1)) / pd2;
        if (u < 0) {
          x=x1;
          y=y1;
        }
     else     if (u > 1.0) {
          x=x2;
          y=y2;
        }
     else {
          x=x1 + u * (x2 - x1);
          y=y1 + u * (y2 - y1);
        }
      }
      return (x - px) * (x - px) + (y - py) * (y - py);
    }
}
