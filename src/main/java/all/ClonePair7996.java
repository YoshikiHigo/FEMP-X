package all;

public class ClonePair7996 {

    int method1(double x1,double y1,double x2,double y2,double px,double py){
      if ((x1 == x2 && y1 == y2) || (x1 == px && y1 == py))   return 0;
      x2-=x1;
      y2-=y1;
      px-=x1;
      py-=y1;
      double slope2=y2 / x2;
      double slopep=py / px;
      if (slope2 == slopep || (x2 == 0 && px == 0))   return y2 > 0 ? (py < 0 ? -1 : py > y2 ? 1 : 0) : (py > 0 ? -1 : py < y2 ? 1 : 0);
      if (x2 >= 0 && slope2 >= 0)   return px >= 0 ? (slope2 > slopep ? 1 : -1) : (slope2 < slopep ? 1 : -1);
      if (y2 > 0)   return px < 0 ? (slope2 > slopep ? 1 : -1) : (slope2 < slopep ? 1 : -1);
      if (slope2 >= 0.0)   return px >= 0 ? (slope2 < slopep ? 1 : -1) : (slope2 > slopep ? 1 : -1);
      return px < 0 ? (slope2 < slopep ? 1 : -1) : (slope2 > slopep ? 1 : -1);
    }

    int method2(double x1,double y1,double x2,double y2,double px,double py){
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
}
