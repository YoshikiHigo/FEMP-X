package unverified;

public class ClonePair10018 {

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

    double method2(double input){
      double thresh=0.0001;
      if ((input > 0 && input < thresh) || (input < 0 && input > -thresh)) {
        return 0;
      }
     else {
        return input;
      }
    }
}
