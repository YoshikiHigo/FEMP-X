package all;

public class ClonePair10637 {

    double method1(double phi){
      double delta=2. * Math.PI;
      if (phi > Math.PI)   delta=-2. * Math.PI;
      while (phi < -Math.PI || phi > Math.PI)   phi+=delta;
      return phi;
    }

    double method2(double ang){
      double a=ang % (2 * Math.PI);
      if (a > Math.PI)   a-=(2 * Math.PI);
     else   if (a < -Math.PI)   a+=(2 * Math.PI);
      return a;
    }
}
