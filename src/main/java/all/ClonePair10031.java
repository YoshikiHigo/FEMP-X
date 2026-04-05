package all;

public class ClonePair10031 {

    double method1(double a){
      double epsilon=1.0e-10;
      final double WFG_min=0.0;
      final double WFG_max=1.0;
      final double min_epsilon=WFG_min - epsilon;
      final double max_epsilon=WFG_max + epsilon;
      if (a <= WFG_min && a >= min_epsilon) {
        return WFG_min;
      }
     else   if (a >= WFG_max && a <= max_epsilon) {
        return WFG_max;
      }
     else {
        return a;
      }
    }

    double method2(double value){
      if (value == 0)   return value;
     else   if ((value > -Double.MIN_NORMAL) && (value < Double.MIN_NORMAL))   return 0;
     else   return value;
    }
}
