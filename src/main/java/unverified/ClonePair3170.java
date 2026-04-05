package unverified;

public class ClonePair3170 {

    int method1(Object o1,Object o2){
      Double sample1=(Double)o1;
      Double sample2=(Double)o2;
      if (sample1.doubleValue() > sample2.doubleValue()) {
        return 1;
      }
      if (sample1.doubleValue() < sample2.doubleValue()) {
        return -1;
      }
      return 0;
    }

    int method2(Object x,Object y){
      double ix=((Double)x).doubleValue();
      double iy=((Double)y).doubleValue();
      if (ix < iy) {
        return -1;
      }
     else   if (ix > iy) {
        return 1;
      }
     else {
        return 0;
      }
    }
}
