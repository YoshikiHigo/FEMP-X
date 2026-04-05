package all;

public class ClonePair1005 {

    boolean method1(double a,double b,double precision){
      if (Double.compare(a,b) == 0)   return true;
      double norm=Math.max(Math.abs(a),Math.abs(b));
      return norm < precision || Math.abs(a - b) < precision * norm;
    }

    boolean method2(double a,double b,double tolerance){
      if (a == 0 && b == 0) {
        return true;
      }
      return (Math.abs((a - b) / (0.5 * (Math.abs(a) + Math.abs(b)))) <= tolerance);
    }
}
