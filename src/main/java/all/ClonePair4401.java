package all;

public class ClonePair4401 {

    double method1(double x,double c){
      if (x < -1)   return 0;
      if (x > 1)   return 1;
      return 0.5 * Math.sin(0.5 * Math.PI * x) + c;
    }

    double method2(double x,double c){
      double r=0.25 * (3 * x - x * x * x) + c;
      if (x < -1)   return 0;
      if (x > 1)   return 1;
      return r;
    }
}
