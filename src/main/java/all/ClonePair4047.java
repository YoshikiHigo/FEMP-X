package all;

public class ClonePair4047 {

    double method1(double a,double b){
      double p=Math.log(1. - b) / Math.log(0.5);
      if (a < .001) {
        return 0.;
      }
     else   if (a > .999) {
        return 1.;
      }
      if (a < 0.5) {
        return Math.pow(2 * a,p) / 2;
      }
     else {
        return 1. - (Math.pow(2 * (1. - a),p) / 2);
      }
    }

    double method2(double a,double b){
      double p=Math.log(1.0 - b) / Math.log(0.5);
      if (a < 0.001)   return (0.0);
      if (a > 0.999)   return (1.0);
      if (a < 0.5)   return (Math.pow(2 * a,p) / 2.0);
      return (1.0 - (Math.pow(2.0 * (1.0 - a),p) / 2.0));
    }
}
