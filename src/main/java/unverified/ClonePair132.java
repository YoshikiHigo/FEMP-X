package unverified;

public class ClonePair132 {

    double method1(double y0,double y1,double y2){
      if ((y0 >= y1) && (y0 >= y2)) {
        return y0;
      }
     else   if (y1 >= y2) {
        return y1;
      }
     else {
        return y2;
      }
    }

    double method2(double a,double b,double c){
      if (a < b)   a=b;
      if (a < c)   a=c;
      return a;
    }
}
