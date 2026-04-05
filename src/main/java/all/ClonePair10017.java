package all;

public class ClonePair10017 {

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

    double method2(double d){
      if ((d < 0.0000000000001) && (d > -0.0000000000001)) {
        return 0.0;
      }
      if ((d > 1000000000000.) || (d < -1000000000000.)) {
        return d;
      }
      StringBuffer s=new StringBuffer();
      s.append(d);
      int len=s.length();
      if (len < 16) {
        return d;
      }
      char cx=s.charAt(len - 1);
      char c1=s.charAt(len - 2);
      char c2=s.charAt(len - 3);
      char c3=s.charAt(len - 4);
      if ((c1 == '0') && (c2 == '0') && (c3 == '0')&& (cx != '.')) {
        s.setCharAt(len - 1,'0');
      }
     else   if ((c1 == '9') && (c2 == '9') && (c3 == '9')&& (cx != '.')) {
        s.setCharAt(len - 1,'9');
        s.append('9');
        s.append('9');
      }
      return Double.valueOf(s.toString()).doubleValue();
    }
}
