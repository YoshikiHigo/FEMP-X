package all;

public class ClonePair5309 {

    boolean method1(double x,double y,double x1,double y1,double x2,double y2,boolean min,boolean max,double d){
      double dx=x2 - x1, dy=y2 - y1;
      double dx2=dx * dx, dy2=dy * dy;
      double p;
      if (dx != 0) {
        p=(((x - x1) / dx) + ((dy * (y - y1)) / dx2)) / (1 + (dy2 / dx2));
      }
     else   if (dy != 0) {
        p=(((y - y1) / dy) + ((dx * (x - x1)) / dy2)) / (1 + (dx2 / dy2));
      }
     else {
        return false;
      }
      if (max && p > 1.0) {
        return false;
      }
     else   if (min && p < 0.0) {
        return false;
      }
      dx=(p * dx) + x1 - x;
      dy=(p * dy) + y1 - y;
      double len=dx * dx + dy * dy;
      return (len < d);
    }

    boolean method2(double x,double y,double x1,double y1,double x2,double y2,boolean min,boolean max,double distance){
      double dx=x2 - x1;
      double dy=y2 - y1;
      if (dx == 0 && dy == 0) {
        return false;
      }
      final double dx2=dx * dx;
      final double dy2=dy * dy;
      final double p;
      if (dx != 0) {
        p=((x - x1) / dx + dy * (y - y1) / dx2) / (1 + dy2 / dx2);
      }
     else {
        p=((y - y1) / dy + dx * (x - x1) / dy2) / (1 + dx2 / dy2);
      }
      if (min && p < 0 || max && p > 1.0) {
        return false;
      }
      dx=p * dx + x1 - x;
      dy=p * dy + y1 - y;
      final double len=dx * dx + dy * dy;
      return len < distance;
    }
}
