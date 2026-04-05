package all;

public class ClonePair9350 {

    double method1(double a){
      double r=a;
      while (r < -Math.PI)   r+=2.0 * Math.PI;
      while (r > Math.PI)   r-=2.0 * Math.PI;
      return r;
    }

    double method2(double phi){
      double delta=2. * Math.PI;
      if (phi > Math.PI)   delta=-2. * Math.PI;
      while (phi < -Math.PI || phi > Math.PI)   phi+=delta;
      return phi;
    }
}
