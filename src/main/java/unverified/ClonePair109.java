package unverified;

public class ClonePair109 {

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

    double method2(double a,double b,double c){
      if (a <= b && a <= c)   return a;
     else   if (b <= a && b <= c)   return b;
     else   return c;
    }
}
