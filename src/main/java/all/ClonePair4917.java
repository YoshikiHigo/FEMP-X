package all;

public class ClonePair4917 {

    double method1(double x1,double y1,double x2,double y2,double x,double y,double z11,double z12,double z21,double z22){
      double delta;
      if (y1 == y2 && x1 == x2) {
        return (z11);
      }
      if (y1 == y2 && x1 != x2) {
        return (z22 * (x - x1) + z11 * (x2 - x)) / (x2 - x1);
      }
      if (x1 == x2 && y1 != y2) {
        return (z22 * (y - y1) + z11 * (y2 - y)) / (y2 - y1);
      }
      delta=(y2 - y1) * (x2 - x1);
      return (z22 * (y - y1) * (x - x1) + z12 * (y2 - y) * (x - x1) + z21 * (y - y1) * (x2 - x) + z11 * (y2 - y) * (x2 - x)) / delta;
    }

    double method2(double x1,double y1,double x2,double y2,double x,double y,double z11,double z12,double z21,double z22){
      double delta;
      if ((y1 == y2) && (x1 == x2)) {
        return (z11);
      }
      if ((y1 == y2) && (x1 != x2)) {
        return (z22 * (x - x1) + z11 * (x2 - x)) / (x2 - x1);
      }
      if ((x1 == x2) && (y1 != y2)) {
        return (z22 * (y - y1) + z11 * (y2 - y)) / (y2 - y1);
      }
      delta=(y2 - y1) * (x2 - x1);
      return (z22 * (y - y1) * (x - x1) + z12 * (y2 - y) * (x - x1) + z21 * (y - y1) * (x2 - x) + z11 * (y2 - y) * (x2 - x)) / delta;
    }
}
