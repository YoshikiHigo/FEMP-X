package all;

public class ClonePair11119 {

    double method1(float x1,float y1,float x2,float y2){
      double rad=0.0d;
      float dx=x2 - x1;
      float dy=y2 - y1;
      if (Math.abs(dx - 0.0) < 0.0001) {
        if (Math.abs(dy - 0.0) < 0.0001) {
          rad=0.0;
        }
     else     if (dy > 0.0) {
          rad=Math.PI / 2.0;
        }
     else {
          rad=Math.PI * 3.0 / 2.0;
        }
      }
     else   if (Math.abs(dy - 0.0) < 0.0001) {
        if (dx > 0.0) {
          rad=0.0;
        }
     else {
          rad=Math.PI;
        }
      }
     else {
        if (dx < 0.0) {
          rad=Math.atan(dy / dx) + Math.PI;
        }
     else     if (dy < 0.0) {
          rad=Math.atan(dy / dx) + (2 * Math.PI);
        }
     else {
          rad=Math.atan(dy / dx);
        }
      }
      return rad;
    }

    double method2(float x1,float y1,float x2,float y2){
      double rad=0.0d;
      float dx=x2 - x1;
      float dy=y2 - y1;
      if (dx == 0.0) {
        if (dy == 0.0) {
          rad=0.0;
        }
     else     if (dy > 0.0) {
          rad=Math.PI / 2.0;
        }
     else {
          rad=Math.PI * 3.0 / 2.0;
        }
      }
     else   if (dy == 0.0) {
        if (dx > 0.0) {
          rad=0.0;
        }
     else {
          rad=Math.PI;
        }
      }
     else {
        if (dx < 0.0) {
          rad=Math.atan(dy / dx) + Math.PI;
        }
     else     if (dy < 0.0) {
          rad=Math.atan(dy / dx) + (2 * Math.PI);
        }
     else {
          rad=Math.atan(dy / dx);
        }
      }
      return rad;
    }
}
