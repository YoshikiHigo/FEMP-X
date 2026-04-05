package all;

public class ClonePair9741 {

    double method1(double p){
      while (p > Math.PI)   p=p - 2. * Math.PI;
      while (p < -Math.PI)   p=p + 2. * Math.PI;
      return p;
    }

    double method2(double phi){
      double delta=2. * Math.PI;
      if (phi > Math.PI)   delta=-2. * Math.PI;
      while (phi < -Math.PI || phi > Math.PI)   phi+=delta;
      return phi;
    }
}
