package all;

public class ClonePair7908 {

    boolean method1(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4,boolean min1,boolean max1,boolean min2,boolean max2){
      final double dx1=x2 - x1, dy1=y2 - y1, dx2=x4 - x3, dy2=y4 - y3;
      double d, p2, p1;
      if (dy1 != 0.0) {
        d=dx1 / dy1;
        p2=(x3 - x1 + d * (y1 - y3)) / (d * dy2 - dx2);
        p1=(dy2 * p2 + y3 - y1) / dy1;
      }
     else   if (dy2 != 0.0) {
        d=dx2 / dy2;
        p1=(x1 - x3 + d * (y3 - y1)) / (d * dy1 - dx1);
        p2=(dy1 * p1 + y1 - y3) / dy2;
      }
     else   if (dx1 != 0.0) {
        d=dy1 / dx1;
        p2=(y3 - y1 + d * (x1 - x3)) / (d * dx2 - dy2);
        p1=(dx2 * p2 + x3 - x1) / dx1;
      }
     else   if (dx2 != 0.0) {
        d=dy2 / dx2;
        p1=(y1 - y3 + d * (x3 - x1)) / (d * dx1 - dy1);
        p2=(dx1 * p1 + x1 - x3) / dx2;
      }
     else {
        return false;
      }
      return (!min1 || p1 >= 0.0) && (!max1 || p1 <= 1.0) && (!min2 || p2 >= 0.0)&& (!max2 || p2 <= 1.0);
    }

    boolean method2(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4,boolean min1,boolean max1,boolean min2,boolean max2){
      double dx1=x2 - x1, dy1=y2 - y1, dx2=x4 - x3, dy2=y4 - y3;
      double d, p2, p1;
      if (dy1 != 0.0) {
        d=dx1 / dy1;
        p2=(x3 - x1 + (d * (y1 - y3))) / ((d * dy2) - dx2);
        p1=(dy2 * p2 + y3 - y1) / dy1;
      }
     else   if (dy2 != 0.0) {
        d=dx2 / dy2;
        p1=(x1 - x3 + (d * (y3 - y1))) / ((d * dy1) - dx1);
        p2=(dy1 * p1 + y1 - y3) / dy2;
      }
     else   if (dx1 != 0.0) {
        d=dy1 / dx1;
        p2=(y3 - y1 + (d * (x1 - x3))) / ((d * dx2) - dy2);
        p1=(dx2 * p2 + x3 - x1) / dx1;
      }
     else   if (dx2 != 0.0) {
        d=dy2 / dx2;
        p1=(y1 - y3 + (d * (x3 - x1))) / ((d * dx1) - dy1);
        p2=(dx1 * p1 + x1 - x3) / dx2;
      }
     else {
        return false;
      }
      return (((!min1) || (p1 >= 0.0)) && ((!max1) || (p1 <= 1.0)) && ((!min2) || (p2 >= 0.0))&& ((!max2) || (p2 <= 1.0)));
    }
}
