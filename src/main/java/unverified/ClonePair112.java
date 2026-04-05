package unverified;

public class ClonePair112 {

    double method1(double a,double b,double c){
      if (a >= b && a >= c)   return a;
     else   if (b >= a && b >= c)   return b;
     else   return c;
    }

    double method2(double a,double b,double c){
      if (a < b)   a=b;
      if (a < c)   a=c;
      return a;
    }
}
